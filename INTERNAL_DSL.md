# Internal DSL

An internal DSL, or domain-specific language, is a programming language or set of constructs specifically tailored to address a particular domain or problem space. Unlike general-purpose programming languages, internal DSLs are designed to provide concise, expressive syntax and semantics that closely match the vocabulary and conceptual model of a specific problem domain.

Before we dive into the contents of our internal DSL let us enumerate some of the general benefits of having an internal DSL:

- **Focused Abstraction** - provide a focused and intuitive syntax, making it easier for domain experts to understand and work with the code.

- **Increased Efficiency** - They enable developers to write concise and expressive code, leading to improved productivity and efficiency in addressing domain-specific challenges.

- **Readability and Maintenance** - promote code that is easy to read and maintain, facilitating collaboration and reducing the learning curve for new developers.

- **Consistency and Constraints** - enforce specific rules and guidelines tailored to the problem domain, ensuring consistency and preventing common errors.

- **Flexibility and Scalability** - DSLs are customizable and extensible, allowing for easy adaptation to evolving requirements and the addition of new features without modifying the core language.

With the development of our internal DSL we thrive to create a more expressive, readable, and maintainable code, customized to the unique needs of our particular problem domain, thereby enhancing our overall development efficiency and code quality.

## Key Concepts

Our internal DSL revolves around the manipulation and processing of table data using various instructions. Here's an overview of the different internal DSL operations followed by possible use cases for each one of them:

1. **Table Creation**

Create a new table with a specified name:
```
internalDSL.table().name("table_name");
```

2. **Data Source Configuration**

Set the source of the data, either from a file or a folder:
```
internalDSL
    .table()
        .name("table_name")
        .source()
            .folder()
            .path("resource_path")
            .end();
```

3. **Output Configuration**

Define the format of the output file and its destination:
```
internalDSL
    .table()
        .name("table_name")
        .outputTo("output_file_path");
```

4. **Operations**

- **Squash Rows**

Combine multiple rows of a table into one single row:
```
internalDSL
    .table()
        .name("table_name")
    .operation()
        .squashRows()
            .end();
```
- **Extract**

Extract specific data based on previously defined selectors (possible selectors may be `MAX`, `MIN` and `MEDIAN`) and comparators (currently we have only implemented `TIME_PERCENTAGE` for the purpose of the Assignment #2):
```
internalDSL
    .table()
        .name("table_name")
    .operation()
        .extract()
            .from("functions")
            .select(Selectors.MAX)
            .sortBy(Comparators.TIME_PERCENTAGE)
            .get("name")
            .end();
```
- **Filter**

Filter out specific data based on blacklisted and / or whitelisted criteria. The criteria can be either regular expressions (for the names of the columns) or object types (for the content values):
```
internalDSL
    .table()
        .name("table_name")
    .operation()
        .filter()
            .blacklist()
                .column(".*\\/.*")
                .objectOfType(List.class)
                .end()
            .whitelist()
                .column("^xyz\\/.*")
                .column(".*File/Path/.*")
                .column("^abc\\/.*")
                .end()
            .end();
```

These examples demonstrate some of the possible instructions and operations that can be performed using our internal DSL. The flexibility and extensibility of this internal DSL allow for complex data processing and manipulation, providing a powerful tool for working with structured data.

