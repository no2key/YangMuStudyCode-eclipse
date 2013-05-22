package cn.edu.bupt.personsort2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSortByAge implements PersonSort {
	@Override
	public void sort(List<Person> persons) {
		// TODO Auto-generated method stub
		Collections.sort(persons, new MyComparator());
	}

	public class MyComparator implements Comparator<Person> {
		@Override
		public int compare(Person p1, Person p2) {
			// TODO Auto-generated method stub
			int tag = 0;
			tag = p1.getAge() - p2.getAge();
			if(tag == 0) {
				return p1.getId() - p2.getId();
			}
			return tag;
		}
	}
}