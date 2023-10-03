
# Design Decisions and Priorities
In the design process of our model we carefully considered the usability and user-friendliness implied.
We wanted to create a model which could be used by non-programmers, so, we adopted a user-centric approach focused on simplicity and clarity.

In order to do that, we established certain priorities to address some design-related concerns:

- **Code Structure and Implementation:**

It's essential to have a well-structured and maintainable codebase for the implementation of the model. So, we tried to use the correct naming conventions and implement a clear separation of concerns between the different components of the system.

- **Inputs and Outputs:**

To determine how the model should handle input and output files, we decided that the model should support a variable number of files. Furthermore, we implemented error handling for missing or invalid files and are starting to implement the support of different file formats beyond YAML (inputs) and CSV (outputs).

- **Configuration Flexibility:**

For the sake of simplicity we decided to establish specific rules for the configuration file. The configuration could be more flexible if users could customize operations beyond the predefined set but that would bring an extra layer of complexity to the system and its usability.

- **Primitives:**

We defined tables as the primary primitive. In order to keep the model simple, we decided to focus on tables, columns, and operations as the core building blocks. Users work with tables and apply operations directly to them.

## Further work:

In the next steps of the project, we should be focused on the enhancement of our model and consider topics that we where not able to include in this Assignment #1:

- **Operations:**

We can enhance the set of operations the model supports, including instructions like filtering, aggregation, joining, and others.

- **Error Handling and Validation:**

Implement a more robust error handling and validation mechanisms to ensure that the model can handle unexpected situations gracefully. Validate inputs, configuration, and intermediate data to prevent issues.

- **Testing and Validation:**

We should plan the testing and validation of the model. Implement unit tests, integration tests, and validation against different use cases to ensure that it behaves as expected. We are also considering involving non-programmer users in user testing to gather feedback and make improvements.

- **Scalability and Performance:**

We should consider how the model performs with varying data sizes and then optimize operations and data structures for efficiency, especially if dealing with large datasets or a high number of files. We can consider implementing parallel processing for improved performance.

- **Logging and Debugging:**

It's important to incorporate logging and debugging features to aid in troubleshooting issues. We should log important events, errors, and debugging information for further analysis.

- **Documentation:**

We should provide accurate documentation for users, including configuration examples, usage guides, and explanations of supported operations.

- **Readability and conciseness:**

As a future concern, we can decide to set maximum numbers for input files as well as operations. In that way we could maintain readability and conciseness of the configuration file while still supporting some form of scalability.