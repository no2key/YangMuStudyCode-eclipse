package cn.edu.bupt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestArray
{
	public static void main(String[] args) throws FileNotFoundException
	{
//		int[] a = new int[3];
//		for (int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
//		int[][] magicSquare = new int[][]
//							{
//								{16, 3, 2, 13},
//								{5, 10, 11, 8},
//								{9, 6, 7, 12},
//								{4, 15, 14, 1}
//							};
//		
//		for (int[] a : magicSquare)
//		{
//			for (int b : a)
//			{
//				System.out.print(b + ", ");
//			}
//			System.out.println();
//		}
		File f = new File("水仙花.txt");
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			System.out.println("cannot create new file.");
//		}
		
		PrintWriter	out = new PrintWriter(f);
		//杨辉三角形空数组的生成
		Scanner in = new Scanner(System.in);
		int rowNum = in.nextInt();
		
		int[][] row = new int[rowNum][];
		for (int i=0; i<rowNum; i++)
		{
			row[i] = new int[i+1];
		}
		
		for (int i=0; i<rowNum; i++) {
			for (int j=0; j<=i; j++) {
				if (j == 0 || j == i) {
					row[i][j] = 1;
				}
				else {
					row[i][j] = row[i-1][j-1] + row[i-1][j];
				}
			}
		}
		
		for (int[] a : row)
		{
			for (int b : a)
			{
				out.printf("%5d", b);
			}
			out.println();
		}
		
		out.flush();
		
		
//		out.println("hello world, haha!");
//		out.flush();
//		Scanner in = new Scanner(f);
//		while(in.hasNext())
//		{
//			String fword = in.next();
//			System.out.println(fword);
//		}
//		
//		System.out.println("JVM启动路径为:" + System.getProperty("user.dir"));
//		
//		String absolutePath = f.getAbsolutePath();
//		System.out.println("文件建立路径为:" + absolutePath);
		
		
	}
}
