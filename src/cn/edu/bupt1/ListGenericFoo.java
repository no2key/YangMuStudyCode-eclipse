package cn.edu.bupt1;

import java.util.ArrayList;
import java.util.HashMap;

//泛型定义
public class ListGenericFoo<T extends ArrayList> {
	private T[] foo;

	public T[] getFoo() {
		return foo;
	}

	public void setFoo(T[] foo) {
		this.foo = foo;
	}
	
	//泛型使用
	public static void main(String[] args) {
		ListGenericFoo<ArrayList<String>> foo1 = new ListGenericFoo<ArrayList<String>>();
		
		ArrayList[] listArray1 = new ArrayList[10];
		//foo1.setFoo(listArray1);
		
		//ListGenericFoo<HashMap<String, String>> foo2 = new ListGenericFoo<HashMap<String, String>>();
	}
}
