import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket server=new ServerSocket(1234);
			
			System.out.println("\n Server is waiting.... ");
			Socket client=server.accept();
			
			DataInputStream dis=new DataInputStream(client.getInputStream());
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			int a,b,c;
			
			a=dis.readInt();
			b=dis.readInt();
			c=a+b;
			
			dos.writeInt(c);
			
			dis.close();
			dos.close();
			client.close();
			server.close();
		}
		catch(Exception e)
		{
			
		}
	}
}