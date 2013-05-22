package cn.edu.bupt.genericinterface;

public class MainTest {
	public static void main(String[] args) {
		Child<String, String> childs = new Child<String, String>();
		
		childs.setFoo1("zhangsan");
		childs.setFoo2("lisi");
		childs.setFoo3("wangwu");
		
		System.out.println(childs.getFoo1());
		System.out.println(childs.getFoo2());
		System.out.println(childs.getFoo3());
	}
}
