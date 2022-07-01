package assessment.task02;

import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientMain {

    public static void main(String[] args) throws IOException {

        System.out.println("Connecting to localhost at port 80");
        Socket sock = new Socket("68.183.239.26", 80);
        System.out.println("Connected ...");

        InputStream is = sock.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        OutputStream os = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        Console cons = System.console();
        String input = cons.readLine("RequestID ");

        dos.writeUTF(input);
        dos.flush();

        String response = dis.readUTF();
        System.out.printf(">> %s\n", response);

        is.close();
        os.close();
        sock.close();

    }


}