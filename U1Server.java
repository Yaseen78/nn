import java.net.*; 
import java.io.*; 
import java.lang.*;
public class MyServer 
{
public static void main(String args[]) throws IOException
{ 
DatagramSocket ds = new DatagramSocket(1234);
byte[] receive =new byte[65535];
DatagramPacket Dpreceive=null;
while(true){
Dpreceive=new DatagramPacket(receive,receive.length);
ds.receive(Dpreceive);
String s=new String(receive);
System.out.println("Client: "+s);
if(s.startsWith("bye")){
System.out.println("Client sent bye...EXITING");
break;}
receive=new byte[65535];}}}

