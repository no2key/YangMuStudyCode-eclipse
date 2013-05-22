package cn.edu.bupt1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		
		//first method of getting the value in map using Set
		Set<String> keys = map.keySet();
		for(String str: keys) {
			System.out.println(map.get(str));
		}
		
		//second method of getting the value in map using Map.Entry<K, V>
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for(Map.Entry<String, String> entry: entrySet) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
}
