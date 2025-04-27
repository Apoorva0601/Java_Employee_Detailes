import java.io.*;
import java.net.*;

public class EmployeeServer {
    public static void main(String[] args) {
        try {
            // Create a server socket listening on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            // Accept the incoming client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create input and output streams
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            // Receive Employee object from client
            Employee e = (Employee) in.readObject();

            // Call calculate method
            e.calculate();

            // 🖨️ Server side print
            System.out.println("Commission has been calculated successfully at server.");

            // Send back modified Employee object
            out.writeObject(e);

            // Close everything
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
