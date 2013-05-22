package cn.edu.bupt;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriter
{
	public static void main(String[] args)
	{
		File f = new File("hello.txt");
		
		try
		{
			Writer writer = new FileWriter(f);
			writer.write("hello,mylady");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try
		{
			Reader reader = new FileReader(f);
			char[] c = new char[100];
			int len = reader.read(c);
			String s = new String(c, 0, len);
			System.out.println(s);
			reader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
