package cn.edu.bupt;

public class TestVarArgues {
	private static int sum(int... nums) {	//这里在类型名称后边加入3个点来表示当前参数的类型时int类型,但是参数的数目并不是固定的,传入几个就能使用几个
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = sum(1, 2, 3);		//按照可变参数方式传递实参
		System.out.println(result);
		
		result = sum(new int[]{1, 2, 3, 4});		//按照数组方式传递实参
		System.out.println(result);
	}
}
