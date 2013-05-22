package cn.edu.bupt.personsort2;

import java.util.List;

public class Environment {
	private PersonSort psort = null;
	
	public Environment(PersonSort psort, List<Person> persons) {
		super();
		this.psort = psort;
	}
	
	//getters and setters
	public PersonSort getPsort() {
		return psort;
	}

	//哈哈哈
	public void setPsort(PersonSort psort) {
		this.psort = psort;
	}

	public void sort(List<Person> persons) {
		this.psort.sort(persons);
	}
	
}
