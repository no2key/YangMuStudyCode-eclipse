package cn.edu.bupt1;

import java.util.ArrayList;
import java.util.List;

public class GenericTest<T> {
	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		//generic 是指向GenericTest<? extends Object>类型的引用变量
		GenericTest<? extends List> generic = null;
		
		generic = new GenericTest<ArrayList>();
		
		//foo 是指向GenericTest<String>类型的引用变量
		GenericTest<Integer> foo = new GenericTest<Integer>();
		foo.setFoo(new Integer(10));
		
		//二者可以进行赋值
		//generic = foo;
		System.out.println(generic.getFoo());
		
		//但是不能通过generic为 foo所指对象进行赋值
		//generic.setFoo(new Integer(9));
		//generic.setFoo("hello world1");
	}
}
