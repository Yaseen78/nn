import java.io.*; 
import java.net.*; 

class Clientt2 { 
    public static void main(String[] args) throws Exception { 
        Socket s = new Socket("localhost", 6969);

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in)); 
        PrintStream out = new PrintStream(s.getOutputStream()); 
        BufferedReader in = new BufferedReader( new InputStreamReader(s.getInputStream())); 

        String str = kb.readLine();
        while (!str.equals("exit")) { 
            out.println(str);
            str = in.readLine(); 
            System.out.println(str); 
            str = kb.readLine();
        } 

        out.close();  
        in.close(); 
        s.close(); 
    } 
}
