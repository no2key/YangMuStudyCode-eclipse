package cn.edu.bupt;

public class StringTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("zhangsan");
		Employee e2 = new Employee("zhangsan");
		System.out.println(e1.equals(e2));
	}
}
class Employee 
{
	private String name;

	public Employee(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object anotherEmployee)
	{
		if (this == anotherEmployee)
		{
			return true;
		}
		if (anotherEmployee instanceof Employee)
		{
			Employee anotherEmployee1 = (Employee)anotherEmployee;
			return this.name.equals(anotherEmployee1.name);
		}
		return false;
	}
}
