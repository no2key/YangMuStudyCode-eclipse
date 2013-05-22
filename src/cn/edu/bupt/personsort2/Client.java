package cn.edu.bupt.personsort2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "zhangsan", 14);
		Person p2 = new Person(4, "lisi", 14);
		Person p3 = new Person(3, "wangwu", 15);
		Person p4 = new Person(2, "wangwu", 15);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		//构造环境类,并传入相应的算法类实例,按照年龄排序
		Environment env = new Environment(new PersonSortByAge(), persons);
//		env.sort();
//		//修改算法类实例传入,按照名字排序
//		env.setPsort(new PersonSortByName());
//		env.sort();
		//同上,按照ID排序
		env.setPsort(new PersonSortById(false));
		env.sort(persons);
		
		for(Person p: persons) {
			System.out.println(p.getId() + ":" + p.getName() + ":" + p.getAge());
		}
	}

}
