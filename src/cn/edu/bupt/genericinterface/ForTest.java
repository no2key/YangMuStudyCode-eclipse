package cn.edu.bupt.genericinterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ForTest {
	public static void main(String[] args) {
		List<String> col = new LinkedList<String>();
		col.add("one");
		col.add("two");
		col.add("three");
		
		//第一种方法-原始
		for(int i=0; i<col.size(); i++) {
			System.out.println(col.get(i));
		}
		
		//第二种方法-迭代器
		for(Iterator<String> itr=col.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		//第三种方法-增强for循环
		for(String str : col) {
			System.out.println(str);
		}
	}
}
