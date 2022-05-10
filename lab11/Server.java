import java.net.*;
import java.io.*;

public class Server extends Thread
{
   private ServerSocket ServerSocket;

   public Server(int port) throws IOException
   {
      ServerSocket = new ServerSocket(port);
      ServerSocket.setSoTimeout(100000);
   }

   public void run()
   {
      while(true)
      {
         try
         {
            System.out.println("Waiting for client on port " +
            ServerSocket.getLocalPort() + "...");
            Socket Server = ServerSocket.accept();
            System.out.println("Just connected to "
                  + Server.getRemoteSocketAddress());
            DataInputStream in =
                  new DataInputStream(Server.getInputStream());
            System.out.println(in.readUTF());
            DataOutputStream out =
                 new DataOutputStream(Server.getOutputStream());
            out.writeUTF("Thank you for connecting to "
              + Server.getLocalSocketAddress() + "\nGoodbye!");
            Server.close();
         }catch(SocketTimeoutException s)
         {
            System.out.println("Socket timed out!");
            break;
         }catch(IOException e)
         {
            e.printStackTrace();
            break;
         }
      }
   }
   public static void main(String [] args)
   {
     System.out.println("Press ctrl+c to terminate");
      int port = Integer.parseInt(args[0]);
      try
      {
         Thread t = new Server(port);
         t.start();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}
