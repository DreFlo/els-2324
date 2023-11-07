# ELS Project

### Authors:
- André Flores
- André Gonçalves
- Tiago Rodrigues

## [Semantic Model](./SEMANTIC_MODEL.md)
Click the link to know more about the semantic model of this project.

## [Configuration File](resources%2FconfigFiles%2FREADME.md)
Click the link to explore the configuration file elements.

## [Design Decisions and Priorities](DESIGN_DECISIONS.md)
Follow the link to read about our decisions and priorities designing this model.

## [Internal DSL](INTERNAL_DSL.md)
Click the link to dive into the key concepts and rules of our Internal DSL.

## Project setup

For this project, you need to [install Gradle](https://gradle.org/install/)

Copy your source files to the ``src`` folder, and your JUnit test files to the ``test`` folder.

## Compile and Running

To compile and install the program, run ``gradle installDist``. This will compile your classes and create a launcher script in the folder ``build/install/els2023-5/bin``. For convenience, there are two script files, one for Windows (``els2023-5.bat``) and another for Linux (``els2023-5``), in the root of the repository, that call these scripts.

After compilation, tests will be automatically executed, if any test fails, the build stops. If you want to ignore the tests and build the program even if some tests fail, execute Gradle with flags "-x test".

When creating a Java executable, it is necessary to specify which class that contains a ``main()`` method should be entry point of the application. This can be configured in the Gradle script with the property ``mainClassName``, which by default has the value ``pt.up.fe.els2023.Main``.

## Test

To test the program, run ``gradle test``. This will execute the build, and run the JUnit tests in the ``test`` folder. If you want to see output printed during the tests, use the flag ``-i`` (i.e., ``gradle test -i``).
You can also see a test report by opening ``build/reports/tests/test/index.html``.
