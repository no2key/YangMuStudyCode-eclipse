package cn.edu.bupt.personsort;

import java.util.Comparator;

public class PersonComparatorInAge implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		int tag = 0;
		if(p1.getAge() < p2.getAge()) {
			tag = -1;
		}
		else if(p1.getAge() > p2.getAge()) {
			tag = 1;
		}
		else {
			if(p1.getId() < p2.getId()) {
				tag = -1;
			} 
			else if(p1.getId() == p2.getId()) {
				tag = 0;
			}
			else {
				tag = 1;
			}
		}
		return tag;
	}

}
