# External DSL

Our DSL provides a flexible way to configure and execute operations on data tables, allowing users to extract data from different sources and define complex transformations and aggregations. The DSL supports multiple data manipulation tasks in a well-organized and readable way, which is crucial for users configuring data extraction tasks.

## Key Concepts

Our Xtext-based external DSL defines the language for configuring and executing our semantic model for data extraction from arbitrary sources.
Here are the key components and concepts of our Xtext grammar:

1. **Start**

The entry point of our grammar is the `Start` rule, which consists of a `CreateTable` element (optional) and a sequence of `TableAction` rules:
```
Start:
  actions+=CreateTable?
  actions+=TableAction*
```

2. **CreateTable**

The `CreateTable` is used to specify the creation of a table based on a specified path. This rule is optional because the user can load data and create a table implicitly.
```
CreateTable:
  "create"? "table" "from" TableInputPath ANY_OTHER
  
// example
create table from "resources/folder";
```

3. **TableAction:**

The `TableAction` rule represents actions that can be performed on the table, such as loading data (`LoadData`), executing operations (`Operation`), or defining output paths (`Output`).
```
TableAction:
  (LoadData | Operation | Output) ANY_OTHER
;
```

4. **LoadData**

The `LoadData` is used to load data from a specified path.

```
LoadData:
  "load" TableInputPath
;
// example
load "resources/data.csv";
```

5. **Output**

The `Output` rule is used to specify output paths for the final results.

```
Output:
  "output" "to"? outputPaths+=STRING ("," outputPaths+=STRING)*
;
// example
output to "output/run3.csv";
```

4. **Operation**

The `Operation` rule encompasses various operations that can be performed on the table, such as Select, RenameColumn, Extract, SquashRows, Filter, and Reduce.
```
Operation:
  (Select | RenameColumn | Extract | SquashRows | Filter | Reduce)
;
```
- **Select**

The `Select` operation rule specifies the selection of columns, via a column name followed by a set of regex patterns:
```
Select:
  "select" columnPatterns+=ColumnName ("," columnPatterns+=ColumnName)*
;
// example
select "column1", "^file\\.xml\\/parent_element\\/.*";
```
- **RenameColumn**

The `RenameColumn` operation rule and its related rules (`RenameColumnPair` - composed by `RenameColumnToPair`, `RenameColumnPrependPair` or `RenameColumnAppendPair`) define the operations to rename columns.
```
RenameColumn:
  "rename" "column"? renameTuples+=RenameColumnPair ("," renameTuples+=RenameColumnPair)*
;
RenameColumnPair:
  RenameColumnToPair | RenameColumnAppendPair | RenameColumnPrependPair
;
RenameColumnToPair:
  oldName=STRING "to" newName=STRING
;
RenameColumnPrependPair:
  oldName=STRING "prepend" prefix=STRING
;
RenameColumnAppendPair:
  oldName=STRING "append" suffix=STRING
;

// examples
rename column "old_name" to "new_name"
rename column "^regex_expression.*" prepend "ABC_"
rename column "^other_regex_expression.*" append "_XYZ";
```

- **Extract**

The `Extract` rule defines the extraction of specific columns from a source column based on certain criteria. To define the extraction criteria the use of `Selector` and a `Comparator` rules are required.
```
Extract:
  "extract" targets+=ExtractColumnMapping ("," targets+=ExtractColumnMapping)* "from" sourceColumn=STRING "select" selector=Selector "sort" "by"? comparator=Comparator
;
ExtractColumnMapping:
  targetColumn=STRING ("as" newName=STRING)?
;

// example
extract "target_column" as "new_name" from "source_column" select TOP 3 sort by "column_name";
```

The `Selector` can be a `KeySelector` or a `TopNSelector`, corresponding to the available rules for column selection.
```
Selector:
  KeySelector | TopNSelector
;
KeySelector:
  key=SELECTOR_KEYWORDS
;
TopNSelector:
  "TOP" n=INT
;
```

The `Comparator` is used in the `Extract` operation rule to define the final sorting of columns.
```
Comparator:
  keys+=ColumnName ("," keys+=ColumnName)*
;
```

- **SquashRows**

The `SquashRows` operation rule is used to combine rows based on specified columns.
```
SquashRows:
  "squash" "rows"? "by" columns+=ColumnName ("," columns+=ColumnName)*
;

// example
squash rows by column1, column2;
```

- **Filter**

The `Filter`operation rule, and the rules which compose it, define filtering options for the table.
`FilterDenylist`, sets a list of denied (filtered) elements `FilterExceptlist`, sets exceptions for that denied list.
`FilterRule` is the criteria used for filtering, which can be `FilterColumnRule` - column names / patterns or, `FilterObjectTypeRule` - content types.
```
Filter:
  "filter" denylist=FilterDenylist exceptlist=FilterExceptlist?
;
FilterDenylist:
  "deny" denylist+=FilterRule ("," denylist+=FilterRule)*
;
FilterExceptlist:
  "except" exceptlist+=FilterRule ("," exceptlist+=FilterRule)*
;
FilterRule:
  FilterColumnRule | FilterObjectTypeRule
;
FilterColumnRule:
  ("column" | "columns") columnPatterns+=ColumnName ("," columnPatterns+=ColumnName)*
;
FilterObjectTypeRule:
  ("object" | "objects") "of"? objectClasses+=ObjectTypeSelector ("," objectClasses+=ObjectTypeSelector)*
;

// example
filter deny objects of STRING except columns ".*#\\d$";
```

- **Reduce**

The `Reduce` operation rule is used to reduce data based on specified object types and aggregation functions.
```
Reduce:
 "reduce" objectClass=ObjectTypeSelector "to"? functions+=SELECTOR_KEYWORDS ("," functions+=SELECTOR_KEYWORDS)*
;

// example
reduce "java.lang.Number" to SUM, AVG;
```

### Complementary Concepts

The define the concepts described above we use the following elements:

- **ColumnName**

The `ColumnName` is used to define column names, allowing for flexibility through keywords or user-defined strings.
```
ColumnName:
  columnName=(COLUMN_NAME_KEYWORDS | STRING)
;
```

- **ObjectTypeSelector**

The `ObjectTypeSelector` is used to specify object types.
```
ObjectTypeSelector:
  objectType=(OBJECT_TYPES | STRING)
;
```

- **TERMINAL**

`SELECTOR_KEYWORDS`, `OBJECT_TYPES`, and `COLUMN_NAME_KEYWORDS` are terminal rules defining specific keywords used in the external DSL.
```
terminal SELECTOR_KEYWORDS returns ecore::EString:
  "MAX" | "MIN" | "MEDIAN" | "SUM" | "AVG"
;
terminal OBJECT_TYPES returns ecore::EString:
  "STRING" |
  "NUMBER" |
  "INTEGER"|
  "FLOAT" |
  "DOUBLE" |
  "BOOLEAN"
;
terminal COLUMN_NAME_KEYWORDS returns ecore::EString:
  "FILENAME" |
  "DIRECTORY"
;
```

This breakdown illustrates how each rule in our Xtext grammar is used to create a configuration file for configuring and executing operations on data tables. The examples showcase the flexibility and expressiveness of the external DSL in defining data manipulation tasks.
