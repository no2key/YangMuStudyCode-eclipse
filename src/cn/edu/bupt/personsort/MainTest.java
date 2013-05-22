package cn.edu.bupt.personsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "zhangsan", 14);
		Person p2 = new Person(2, "lisi", 14);
		Person p3 = new Person(3, "wangwu", 15);
		Person p4 = new Person(4, "wangwu", 15);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		Person[] persons = null;
		persons = (Person[])list.toArray();
		
		Arrays.sort(persons, new PersonComparatorInAge());
		
		for(Person p: persons) {
			System.out.println(p.getId() + ":" + p.getName() + ":" + p.getAge());
		}
	}

}
