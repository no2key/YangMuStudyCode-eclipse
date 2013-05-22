package cn.edu.bupt1;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		GenericMethod<String> gm = new GenericMethod<String>();
		
		gm.show("hello,gm.show");
		gm.show(18);
		
		gm.print(new Integer(19));
		//gm.print("Hello,gm.print");	//illegal, because of <Q extends Number>
		
		gm.show2("Hello,gm.show2, age = ", new Integer(20));	//care
		
		GenericMethod.print2 (3.14159);			//recommended√
		gm.print2("again, in print2 Method");	// not recommended×
		
		System.out.println("--------------------");
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String[] a = list.toArray(new String[0]);
		System.out.println(a[0]);
	}
}
class GenericMethod<T> {
	public <F> void show(F str) {
		System.out.println(str);
	}
	
	public <Q extends Number> void print(Q str) {
		System.out.println(str);
	}
	
	public <D> void show2(T str1, D str2) {
		System.out.println(str1.toString() + str2.toString());
	}
	
	public static <P> void print2(P str) {
		System.out.println(str);
	}
}
