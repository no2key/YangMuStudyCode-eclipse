package cn.edu.bupt.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("world");
		list.add("world");
		list.add("welcome");

		String s1 = list.get(0);
		String s2 = list.get(1);
		String s3 = list.get(2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("-------------------");

		for (int i = 0; i < list.size(); i++) // size获取集合中元素的个数
		{
			System.out.println(list.get(i));
		}

		System.out.println("-------------------");
		
		list.remove("world");			//list.remove(String s)
		//list.remove(2);				//list.remove(int i)  将后续元素向上移动,以填补被清除掉的元素

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("-------------------");
		
		System.out.println("index:" + list.indexOf("hello"));
		
		System.out.println("-------------------");

		list.clear(); // list.clear()
		System.out.println(list.size());

		System.out.println("-------------------");

		System.out.println(list.isEmpty()); // list.isEmpty()
	}
}
