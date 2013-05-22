package cn.edu.bupt1;

public class WrapperFoo<T> {
	private GenericFoo1<T> foo;

	public GenericFoo1<T> getFoo() {
		return foo;
	}

	public void setFoo(GenericFoo1<T> foo) {
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		//构造内部泛型类型实例
		GenericFoo1<Integer> foo = new GenericFoo1<Integer>();
		foo.setFoo(new Integer(-10));
		//构造外部泛型类型实例,此时需要传入内部泛型类型实例
		WrapperFoo<Integer> wrapperfoo = new WrapperFoo<Integer>();
		wrapperfoo.setFoo(foo);
		
		System.out.println(wrapperfoo.getFoo().getFoo());
	}
}

class GenericFoo1<T> {
	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
}