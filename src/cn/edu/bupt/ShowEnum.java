package cn.edu.bupt;

public enum ShowEnum {
	hello;
	private static void enumCompareTo(OpConstant constant) {
		System.out.println(constant);
		
		for(OpConstant op : OpConstant.values()) {
			System.out.println(constant);
		}
	}
	
	public static void main(String[] args) {
		enumCompareTo(OpConstant.valueOf(args[0]));
	}
}
