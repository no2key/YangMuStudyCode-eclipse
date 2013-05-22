package cn.edu.bupt1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			String value = itr.next();
			System.out.println(value);
		}
		
		System.out.println("----------------------");
		
		Set<Person> set1 = new HashSet<Person>();
		
		set1.add(new Person("zhangsan", 20, "beijing"));
		set1.add(new Person("lisi", 30, "shanghai"));
		set1.add(new Person("wangwu", 40, "nanjing"));
		
		for(Person p: set1) {
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getAddress());
		}
	}
}

class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	//setter and getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
