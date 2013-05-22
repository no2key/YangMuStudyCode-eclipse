package cn.edu.bupt.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest2
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++)
		{
			list.add(new Integer(i + 1));
		}

		/*
		 * Object[]不能转换为Integer[],这样在运行时会发生类型转换错误,需要针对单个元素进行转换
		 */
		//Integer[] inte = (Integer[]) list.toArray();
		Object[] inte = list.toArray();
		for (int i = 0; i < inte.length; i++)
		{
			System.out.println(((Integer)inte[i]).intValue());
		}

	}
}
