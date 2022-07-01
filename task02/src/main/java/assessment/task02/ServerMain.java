package assessment.task02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerMain {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(80);

        System.out.println("Waiting for connection on port 80...");
        Socket sock = server.accept();
        System.out.println("Connection accepted");
        
        InputStream is = sock.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        OutputStream os = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        String request = dis.readUTF();

        System.out.printf("Received request: %s\n", request);
        request = "From the server: " + request.toUpperCase();

        dos.writeUTF(request);
        is.close();
        os.close();
        sock.close();
    }

}
