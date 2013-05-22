package cn.edu.bupt.personsort2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSortByName implements PersonSort, Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
				int tag = 0;
				if(p1.getName().compareTo(p2.getName()) < 0) {
					tag = -1;
				}
				else if(p1.getName().compareTo(p2.getName()) > 0) {
					tag = 1;
				}
				else {
					if(p1.getId() < p2.getId()) {
						tag = -1;
					}
					else if(p1.getId() > p2.getId()) {
						tag = 1;
					}
					else {
						tag = 0;
					}
				}
				return tag;
	}

	@Override
	public void sort(List<Person> persons) {
		// TODO Auto-generated method stub
		Collections.sort(persons, this);
	}

}
