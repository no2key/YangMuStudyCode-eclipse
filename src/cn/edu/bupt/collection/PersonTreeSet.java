package cn.edu.bupt.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonTreeSet
{
	public static void main(String[] args)
	{
		PersonTreeSet pt = new PersonTreeSet();
		PersonTreeSet.Person p1 = pt.new Person(10);
		Person p2 = pt.new Person(20);
		Person p3 = pt.new Person(30);
		
		Set<PersonTreeSet.Person> set = new TreeSet<PersonTreeSet.Person>(p1);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for (Iterator<PersonTreeSet.Person> itr = set.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		
		
	}
	
	private class Person implements Comparator<Person>
	{
		private int score;
		
		public Person(int score)
		{
			this.score = score;
		}
		
		@Override
		public int compare(Person o1, Person o2)
		{
			return o2.score - o1.score;
		}
		
		@Override
		public String toString()
		{
			return String.valueOf(this.score);
		}
	}
}
