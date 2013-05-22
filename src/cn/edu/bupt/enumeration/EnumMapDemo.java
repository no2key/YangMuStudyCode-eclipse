package cn.edu.bupt.enumeration;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

	private enum Action {
		TURN_LEFT, SHOOT, TURN_RIGHT;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Action, String> map = new EnumMap<Action, String>(Action.class);	//泛型首先需要传递类型参数方可变为类
		map.put(Action.valueOf("TURN_LEFT"), "向左转");
		map.put(Action.TURN_RIGHT, "向右转");
		map.put(Action.valueOf("SHOOT"), "射击");
		
		for(Action ac : map.keySet()) {
			String value = map.get(ac);
			System.out.println(ac + " = " + value);
		}
	}
}