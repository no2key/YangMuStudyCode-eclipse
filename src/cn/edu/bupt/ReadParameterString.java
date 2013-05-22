package cn.edu.bupt;

import java.util.HashMap;
import java.util.Set;

public class ReadParameterString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String param : args) {
			map.put(param, null==map.get(param) ? 1 : map.get(param)+1);	//1被自动装箱,map.get(param)被自动拆箱,map.get(param)+1被自动装箱
		}
		
		Set<String> set = map.keySet();
		for(String key : set) {
			int value = map.get(key);		//通过key获取的Integer类型的value值被自动拆箱为dint类型值
			System.out.println(key + " = " + value);
		}
	}
}
