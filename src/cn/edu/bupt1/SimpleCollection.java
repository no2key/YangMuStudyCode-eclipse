package cn.edu.bupt1;

public class SimpleCollection<T> {
	private Object[] objArr;
	private int index = 0;
	
	public SimpleCollection() {
		super();
		this.objArr = new Object[10];
	}

	public SimpleCollection(int capacity) {
		super();
		this.objArr = new Object[capacity];
	}
	
	public void add(T t) {
		this.objArr[this.index++] = t;
	}
	
	public int getLen() {
		return this.index;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int i) {
		return (T)this.objArr[i];
	}
}
