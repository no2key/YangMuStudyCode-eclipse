package cn.edu.bupt.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ss = new ServerSocket(8001);
			while (true)
			{
				Socket s = ss.accept();
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
