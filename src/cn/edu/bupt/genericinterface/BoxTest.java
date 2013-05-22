package cn.edu.bupt.genericinterface;

import java.util.ArrayList;
import java.util.Collection;

public class BoxTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Collection<Integer> col = new ArrayList<Integer>();
		
		//不使用自动装箱拆箱的方式
		col.add(new Integer(2));
		
		//以下是用自动装箱拆箱方式加入到集合类中
		col.add(3);		//将int类型的3转换为Integer类型并放入到集合类中
		col.add(a + 3);	//先进行数学计算,然后转换为Integer类型放入集合类中
		
		for(int number : col) {	//将col中加入的Integer类型数据自动拆箱转换为int类型,并进行输出
			System.out.println(number);
		}
	}
}
