package cn.edu.bupt.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorTest
{
	public static void main(String[] args)
	{
		Set<String> set = new TreeSet<String>(new MyComparator());
		
		set.add("a");
		set.add("b");
		set.add("e");
		set.add("f");
		set.add("c");
		
		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
	}
	
	public static class MyComparator implements Comparator<String>
	{
		@Override
		public int compare(String o1, String o2)
		{
			return -o1.compareTo(o2);
		}
	}
}
