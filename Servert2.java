import java.io.*;
import java.net.*;

class Servert2 {
    public static void main(String[] a) throws Exception {
        ServerSocket ss = new ServerSocket(6969);

        Socket s = ss.accept();
        System.out.println("GG");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(s.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	
         String str = in.readLine();
        while (str != null) {
            System.out.println("Client : " + str);
            str = keyboard.readLine();

         out.println("Server : " + str);
            str = in.readLine();
        }

        in.close();
        out.close();
        keyboard.close();
        s.close();
    }
}
