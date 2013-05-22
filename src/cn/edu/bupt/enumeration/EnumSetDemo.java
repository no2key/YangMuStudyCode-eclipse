package cn.edu.bupt.enumeration;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class EnumSetDemo {
	
	//内部枚举类
	private enum FontConstant {
		Plain, Bold, Italic;
	}
	
	private static void showEnumSet(EnumSet<FontConstant> enumSet) {
		for(Iterator<FontConstant> itr = enumSet.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		List<FontConstant> list = new ArrayList<FontConstant>();
		
		for(FontConstant fc : FontConstant.values()) {
			list.add(fc);
		}
		EnumSet<FontConstant> enumSet = EnumSet.copyOf(list);
		
		showEnumSet(enumSet);
	}
}
