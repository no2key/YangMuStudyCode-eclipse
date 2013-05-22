package cn.edu.bupt.array;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest1
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		char c = 'A';
		for (int i=0; i<5; i++)
		{
			list.add(new String(new char[]{c++}));
		}
		
		for (Iterator<String> itr=list.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------");
		list.addLast("F");		//LinkedList.addLast()
		list.addFirst("8");		//LinkedList.addFirst()
		list.add(1, "A2");		//在指定索引位置插入元素
		
		list.remove("A2");		//LinkedList.remove()
		list.remove(2);
		
		System.out.println("-------------");
		String value = list.get(2);
		list.set(2, value + "changed");		//LinkedList.set()方法
		
	}
}
