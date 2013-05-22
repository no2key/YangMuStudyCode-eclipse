package cn.edu.bupt.collection;

import java.util.ArrayList;

public class ArrayListTest2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i=0; i<10; i++)
		{
			list.add(i + 1);
		}
		
		Integer[] integers = list.toArray(new Integer[0]);
		
		for (int i=0; i<integers.length; i++)
		{
			System.out.println(integers[i].intValue());
		}
	}

}
