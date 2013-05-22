package cn.edu.bupt.array;

public class LinkedListTest3
{
	public static void main(String[] args)
	{
		Node<String> node1 = new Node<String>("Node1");
		Node<String> node2 = new Node<String>("Node2");
		Node<String> node3 = new Node<String>("Node3");
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node1);
		
		node1.setPrevious(node3);
		node2.setPrevious(node1);
		node3.setPrevious(node2);
		
		System.out.println("-------在Node1和Node2之间插入Node4--------");
		Node<String> node4 = new Node<String>("Node4");
		
		node1.setNext(node4);
		node4.setNext(node2);
		
		node2.setPrevious(node4);
		node4.setPrevious(node1);
		
		System.out.println("-----删除Node4------");
		node1.setNext(node2);
		node2.setNext(node1);
		
		node4.setNext(null);
		node4.setPrevious(null);
		
	}
}

class Node<T>
{
	//--------constructor---------
	public Node(T data)
	{
		super();
		this.data = data;
	}
	//------getter&setter----------
	public Node<T> getPrevious()
	{
		return previous;
	}
	public void setPrevious(Node<T> previous)
	{
		this.previous = previous;
	}
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	public Node<T> getNext()
	{
		return next;
	}
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	//--------private method----------
	private Node<T> previous = null;
	private T data = null;
	private Node<T> next = null;
	
	
}