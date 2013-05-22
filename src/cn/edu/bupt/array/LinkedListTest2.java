package cn.edu.bupt.array;

/**
 * 模拟链表操作
 * @author Medow
 *
 */
public class LinkedListTest2
{
	public static void main(String[] args)
	{
		ListElement<String> le1 = new ListElement<String>("Node1");
		ListElement<String> le2 = new ListElement<String>("Node2");
		ListElement<String> le3 = new ListElement<String>("Node3");
		
		le1.setNext(le2);
		le2.setNext(le3);
		
		System.out.println(le1.getNext().getNext().getData()); 		//通过le1获取le3中的数据
		
		System.out.println("----------------");
		
		//将le4插入到le1和le2之间
		ListElement<String> le4 = new ListElement<String>("Node4");
		le1.setNext(le4);
		le4.setNext(le2);
		
		System.out.println(le1.getNext().getNext().getNext().getData());	//再通过le1获取le3中的数据
		
		System.out.println("-----------------");
		//再将le1指向le2
		le1.setNext(le2);
		le4.setNext(null);
		
		System.out.println(le1.getNext().getNext().getData()); 		//再通过le1获取le3中的数据
	}
}

class ListElement<T>
{
	//---------constructor---------------
	public ListElement(T data)
	{
		super();
		this.data = data;
	}
	
	//--------getter&setter--------------
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	public ListElement<T> getNext()
	{
		return next;
	}
	public void setNext(ListElement<T> next)
	{
		this.next = next;
	}
	
	public boolean hasNext()
	{
		return null != this.next;
	}
	//--------------------private-----------
	private T data;
	private ListElement<T> next;
	
	
}
