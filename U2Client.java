import java.io.*;
import java.net.*;
class Udpclient
{
    public static void main(String a[])throws Exception
    {
        DatagramSocket socket = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InetAddress address = InetAddress.getLocalHost();

        byte bytes[] = new byte[256];
        byte buffer[] = new byte[256];
        while(true) {
            System.out.println("Enter the Message:");
            String msg = br.readLine();
            bytes = msg.getBytes();

            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, 6969);
            socket.send(packet);

            if(msg.equals("exit"))
                break;

            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received msg: " + message);
        }
    }
}
