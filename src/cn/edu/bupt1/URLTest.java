package cn.edu.bupt1;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest
{
	public static void main(String[] args)
	{
		try
		{
			URL url = new URL("http://www.hao123.com/");
			System.out.println("Protocol:" + url.getProtocol());
			System.out.println("Port:" + url.getPort());
			System.out.println("Host:" + url.getHost());
			System.out.println("File:" + url.getFile());
			System.out.println("Ext:" + url.toExternalForm());
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
