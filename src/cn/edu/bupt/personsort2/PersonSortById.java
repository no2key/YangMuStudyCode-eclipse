package cn.edu.bupt.personsort2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSortById implements PersonSort, Comparator<Person> {
	
	private boolean isAsc;
	
	public PersonSortById(boolean isAsc) {
		this.isAsc = isAsc;
	}
	@Override
	public void sort(List<Person> persons) {
		// TODO Auto-generated method stub
		Collections.sort(persons, this);
	}
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int pId1 = o1.getId();
		int pId2 = o2.getId();
		return this.isAsc ? (pId1 - pId2) : (pId2 - pId1);
	}
	
	
}
