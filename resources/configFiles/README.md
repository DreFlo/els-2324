# Configuration File

The configuration file is a `JSON` file which was created with the intent of being the first stage for creating a `DSL` for data extraction from arbitrary sources.

This file represents a configuration for data transformation, defining a process which involves the creation of one or more tables, extracting data from a number of source files into a specified number of columns.

The configuration allows the renaming of columns and sets the output files where the resulting data should be saved.

The configuration elements and its corresponding concerns are described below:

### tables:
This is the root element of the `JSON` file. It is an `array` that contains one or more `objects`, each corresponding to the configuration data extraction, manipulation and storage involving a specific table.

### name:
Inside a table object, there is a "name" field, which is a `string` that represents the name of the table.

### sources

For each table object there is an array of data sources used as inputs or extraction sources. Each data source has two attributes:
- `type`: A `string` that indicates the type of source.
- `path`: A `string` that specifies the path to the data source (which, in the provided example, points to YAML files located in the "resources" directory).

### operations

This is an array which encompasses all the operations to be performed for the data extraction (from input sources) and data manipulation (on the table itself).

Each operation object has the following attributes:
- `type`: Specifies the type of operation to be performed.
- `columns`: Used for `select` operations, this `array` lists the columns to be selected from the data source.
- `oldName`: Used in `renameColumn` operations, this `string` field indicates the current name of the column to be renamed.
- `newName`: used also in `renameColumn` operations, is a `string` field which specifies the new name for the column.

### outputs:

This is an `array` of output destinations for the transformed table data.

### **Further notes:**
Currently, at the time of the Assignment #1, our implementation allows only the extraction of data from `YAML` sources and, at the moment, the available operations to be performed are "select" and "renameColumn".

The operations listed in our `JSON` file example represent:

- Selecting specific columns from the source data related to decision tree parameters.
- Renaming columns, such as "params/criterion" to "Criterion" and so on.

The resulting data is currently saved in `CSV` files.
In the configuration example, we specified only one output file:
- "output/table.csv": which indicates that the transformed data will be saved as a `CSV` file in the "output" directory.