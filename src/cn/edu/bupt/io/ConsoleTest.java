package cn.edu.bupt.io;

import java.io.Console;

public class ConsoleTest
{
	public static void main(String[] args)
	{
//		try
//		{
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("please input a line;");
//			String input = br.readLine();
//			System.out.println("the input string is: " + input);
//		}
//		catch (IOException e) 
//		{
//		}
		
//		Scanner in = new Scanner(System.in);
//		String input = in.nextLine();
//		System.out.println(input);
		
		Console in = System.console();
		String input = in.readLine();
		System.out.println(input);
		
	}
}
