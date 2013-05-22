package cn.edu.bupt.newreflection;

public class InterfaceClass
{
	public static void main(String[] args)
	{
		People p = new Student();
		System.out.println(p.getClass().getName());
	}
	
	private static interface People
	{
		
	}
	
	private static class Student implements People
	{
		
	}
}
