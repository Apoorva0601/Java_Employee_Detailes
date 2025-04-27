import java.io.*;
import java.net.*;

public class EmployeeClient {
    public static void main(String[] args) {
        try {
            // Connect to server at localhost, port 5000
            Socket socket = new Socket("localhost", 5000);

            // Create input and output streams for object transfer
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            // Create an Employee object and get details from keyboard
            Employee e = new Employee();
            e.get();

            // Send Employee object to server
            out.writeObject(e);

            // Receive updated Employee object from server
            Employee updatedEmployee = (Employee) in.readObject();

            // Display updated details
            updatedEmployee.display();

            // Close everything
            out.close();
            in.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
