package cn.edu.bupt.personsort;

import java.util.Comparator;

public interface Resort {
	void resort(Person[] persons, Comparator<Person> comparatorForPerson);
}
