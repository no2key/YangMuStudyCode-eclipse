package cn.edu.bupt.personsort;

import java.util.Comparator;

public class PersonComparatorInName implements Comparator<Person> {

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

}
