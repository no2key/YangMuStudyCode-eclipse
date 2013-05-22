package cn.edu.bupt;

import java.util.Arrays;

public class RandomTest
{
	public static void main(String[] args)
	{
		int[] a = {14, 14, 16, 21, 27, 36, 37, 39, 39, 50, 14};
		Arrays.sort(a);
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + "  ");
		}
	}
}
