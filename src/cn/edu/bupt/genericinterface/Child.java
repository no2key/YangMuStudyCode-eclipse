package cn.edu.bupt.genericinterface;

public class Child<T1, T2> extends Parent<T1, String> {
	private T2 foo3 = null;

	public T2 getFoo3() {
		return foo3;
	}

	public void setFoo3(T2 foo3) {
		this.foo3 = foo3;
	}
}
