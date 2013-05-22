package cn.edu.bupt.reflect;

import java.lang.reflect.Array;

public class ArrayList2 {
	public static void main(String[] args) {
		//该数组用于设置数组的维度,以及每一维的长度
		int[] dims = new int[] { 5, 10, 15 };
		
		//通过反射定义了一个三维数组,每一维的长度分别是5, 10, 15
		Object array = Array.newInstance(Integer.TYPE, dims);
		System.out.println(array instanceof int[][][]); 	//创建了一个三维数组,打印结果是true
		//secondDims现在指向了一个二维数组
		Object secondDims = Array.get(array, 1);
		//thirdDims现在指向了一个一维数组
		Object thirdDims = Array.get(secondDims, 1);
		//向该以为数组中设置int类型的元素值
		Array.set(thirdDims, 1, 15);
		
		System.out.println(Array.get(thirdDims, 1));
		
		//强制类型转换,运行时并不会抛出异常
		int[][][] arrayCast = (int[][][])array;
		
		//Class.getComponentType()方法打印的是将array对象看做一维数组时,其内部数组元素类型所对应的Class对象
		Class<?> componentType = array.getClass().getComponentType();
		System.out.println(componentType);
	}
}
