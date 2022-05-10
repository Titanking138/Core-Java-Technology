import java.net.*;
import java.io.*;

public class Client
{
   public static void main(String [] args)
   {
      String serverName = args[0];
      int port = Integer.parseInt(args[1]);
      try
      {
         System.out.println("Connecting to " + serverName +
		 " on port " + port);
         Socket Client = new Socket(serverName, port);
         System.out.println("Just connected to "
		 + Client.getRemoteSocketAddress());
         OutputStream outToServer = Client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         out.writeUTF("Hello from "
                      + Client.getLocalSocketAddress());
         InputStream inFromServer = Client.getInputStream();
         DataInputStream in =
                        new DataInputStream(inFromServer);
         System.out.println("Server says " + in.readUTF());
         Client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}

