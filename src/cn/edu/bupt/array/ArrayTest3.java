package cn.edu.bupt.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest3
{
	public static void main(String[] args)
	{
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(2, 3));
		list.add(new Point(3, 4));
		
		for(Iterator<Point> itr = list.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		System.out.println(list.toString());
	}
}

class Point
{
	int x;
	int y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	/**
	 * @return 
	 */
	@Override
	public String toString()
	{
		return "x=" + this.x + ", y=" + this.y + ";";
	}
}
