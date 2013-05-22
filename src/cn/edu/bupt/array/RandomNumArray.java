package cn.edu.bupt.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RandomNumArray
{
	public static void main(String[] args)
	{
		RandomArray ra = new RandomArray(50);
		List<NumStruct> list = ra.generateRandomArrayWithNums();
		
		for (NumStruct ns : list)
		{
			System.out.println(ns.getNum() + "==>" + ns.getTimes());
		}
	}

}

class RandomArray
{
	public RandomArray(int arrayLen)
	{
		this.randomArray = new int[arrayLen];
		this.sortResult = new LinkedList<NumStruct>();
	}
	
	public List<NumStruct> generateRandomArrayWithNums()
	{
		//生成随机数
		for (int i=0; i<this.randomArray.length; i++)
		{
			this.randomArray[i] = (int)(Math.random() * 41 + 10);
		}
		//对数组进行排序
		Arrays.sort(this.randomArray);
		for (int i=0; i<this.randomArray.length; i++)
		{
			System.out.print(this.randomArray[i] + " ");
		}
		System.out.println();
		
		//统计随机数
		int counter = 0;
		for (int i=0; i<this.randomArray.length; i++)
		{
			counter = 1;
			System.out.println(this.randomArray[i]);
			for (int j=i+1; j<this.randomArray.length && this.randomArray[j] == this.randomArray[i]; j++)
			{
				System.out.println(this.randomArray[j]);
				counter++;
				i++;
			}
			this.sortResult.add(new NumStruct(this.randomArray[i], counter));
		}
		
		return this.sortResult;
		
	}

	//private field
	private int[] randomArray = null;
	private List<NumStruct> sortResult = null;
	
}

class NumStruct
{
	//constructor
	public NumStruct(int num, int times)
	{
		super();
		this.num = num;
		this.times = times;
	}
	
	//getter and setter
	public int getNum()
	{
		return num;
	}
	public int getTimes()
	{
		return times;
	}

	//private field
	private int num;
	private int times;
	
	
}