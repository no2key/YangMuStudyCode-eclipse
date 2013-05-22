package cn.edu.bupt.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester {
	//该方法实现对Customer对象的copy操作
	@SuppressWarnings("unchecked")
	public <T> T copy(T t) throws Exception{
		Class<?> classType = t.getClass();
		System.out.println(classType.getName());
		
		//利用Constructor类通过目标类中的指定构造函数生成目标类的一个实例对象
		Constructor<?> cons = classType.getConstructor(new Class<?>[]{});
		Object objectCopy = cons.newInstance(new Object[]{});		//objectCopy是准备返回的对象
		
		//以上两行代码等价于下面一行
		//Object obj2 = classType.newInstance();
		//System.out.println(obj2);
		
		//利用Constructor类通过目标类中的指定构造函数生成目标类的一个实例对象,但此时是调用含有参数的构造方法.
		//Constructor cons2 = classType.getConstructor(new Class<?>[]{String.class, int.class});
		//Object obj3 = cons2.newInstance(new Object[]{"zhangsan, 24"});
		
		//获取对象的所有成员字段
		Field[] fields = classType.getDeclaredFields();
		
		//对于类中的每一个字段循环获得其getter和setter方法
		for(Field field : fields) {
			String currentField = field.getName();
			String fieldFirstLetter = currentField.substring(0, 1).toUpperCase();	//将属性的首字母转换为大写
			
			//获取getter和setter方法名称
			String getMethodName = "get" + fieldFirstLetter + currentField.substring(1);
			String setMethodName = "set" + fieldFirstLetter + currentField.substring(1, currentField.length());
			
			//获取getter和setter方法对象
			Method getMethod = classType.getMethod(getMethodName, new Class<?>[]{});
			Method setMethod = classType.getMethod(setMethodName, new Class<?>[]{field.getType()});		//setter方法均有参数,并且参数类型与所对应的Field的类型相一致
			
			Object value = getMethod.invoke(t, new Object[]{});			//从原始对象中通过调用getter方法获取字段值
			setMethod.invoke(objectCopy, new Object[]{value});			//将获取的字段值再通过objectCopy中的setter方法设置进去
		}
		return (T)objectCopy;
	}
	
	//测试
	public static void main(String[] args) throws Exception{
		Customer customer = new Customer();
		customer.setId(1L);	//这里1L自动装箱为Long类型
		customer.setAge(24);
		customer.setName("zhangsan");
		
		ReflectTester rt = new ReflectTester();
		Customer customerCopy = rt.copy(customer);
		
		System.out.println("id:" + customerCopy.getId() + "=> name:" + customerCopy.getName() + "=> age:" + customerCopy.getAge());
	}
}

class Customer {
	private static Long id = 0L;
	private String name;
	private int age;
	
	public Customer(){}

	public Customer(String name, int age) {
		super();
		id++;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		Customer.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}