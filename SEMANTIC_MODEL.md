# Semantic Model

The initial version of the semantic model was designed to be a robust and adaptable data extraction and transformation model.
It can be properly described by the roles and responsibilities of each component within the overall system:

1. **Controller:**
   
The `Controller` serves as the central coordinator of the entire process. It initiates and manages the execution flow of the data extraction, manipulation and ultimately the storage of the resulting data.

2. **Command:**

`Commands` represent actions or operations that the `TableManipulator` can use. They encapsulate specific tasks to be performed according to the configuration instructions.

3. **Table Config:**

The `TableConfig` component has all the information that was parsed from the configuration file (sources, operations (as `Command`), and outputs).

4. **File Parser:**

The `File Parser` is responsible for parsing the `JSON` configuration file and the `YAML` source files specified in the configuration.
- For the `JSON` configuration file, it extracts all of the table objects including its names, sources, commands and outputs.
- For the `YAML` source files, it extracts the relevant data, and places it into a format to be used in the table creation and manipulation process.

5. **Table:**

The `Table` component represents the data structure used for intermediate data storage and manipulation. It defines the structure of the table, which includes a `header` (with the name of each column), and the correspondent `rows`. The table component provides methods for populating, and retrieving the data.

6. **Table Builder:**

The `Table Builder` is responsible for constructing tables based on the data extracted from the source files through the `File Parser`.

7. **Table Manipulator:**

The `Table Manipulator` is responsible for applying transformations to the table data. It handles operations (such as renaming and selecting columns) specified in the configuration file.

8. **File Writer:**

As the name implies, the `File Writer` handles the writing of the final transformed data into an output file. It takes the data produced by the `Table Manipulator` and stores it in the specified output location.

![](docs/images/Semantic%20Model.png)

## How does this model work?

At the time of the Assignment #1, this semantic model represents a data extraction and  manipulation pipeline where data is extracted from YAML files, processed, and finally stored into a CSV file. Each component plays a specific role in this pipeline, contributing to the overall functionality of the system.

Bellow is a description of how the described components interact within the semantic model in order to achieve the desired result:

- The `Controller` uses the `Table Config` to coordinate the entire process.
- Based on the configuration, the `Controller` instructs the `File Parser` to read and parse the specified `YAML` source files.
- The parsed data is passed to the `Table Builder` to create a new instance of a `Table`.
- The `Controller` then directs the `Table Manipulator` to apply additional transformations, such as column renaming.
- Ultimately, the transformed data is sent to the `File Writer`, which exports it to a `CSV` output file as specified in the configuration.
