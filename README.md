# Employee Transfer Project

## Description

This project demonstrates a client-server application where an `Employee` object is transferred from a client to a server. The server calculates a 5% commission based on the employee's basic salary and sends the updated employee object back to the client.

### Components

1. **Employee Class**:
   - A `Serializable` class representing employee details (ID, name, basic salary, and commission).

2. **EmployeeClient**:
   - The client application that sends employee details to the server and receives the updated employee object after commission calculation.

3. **EmployeeServer**:
   - The server application that listens for incoming client connections, calculates commission, and returns the updated employee details to the client.

### How to Run

1. **Start the Server**: 
   - Compile and run the `EmployeeServer` class.
   ```bash
   javac EmployeeServer.java
   java EmployeeServer
   
2. **Start the Client**:
    - Compile and run the `EmployeeClient` class.
    ```bash
    javac EmployeeClient.java
    java EmployeeClient
