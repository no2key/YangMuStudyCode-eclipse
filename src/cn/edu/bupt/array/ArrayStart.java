package cn.edu.bupt.array;


public class ArrayStart
{
	public static void main(String[] args)
	{
		int[] a = new int[] { 1, 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 16, 19, 22,
				23, 25, 27 };
		int value = 17;
		int index = binarySearch(a, value);
		System.out.println(index);
	}

	private static int binarySearch(int[] a, int value)
	{
		int startIndex = 0;
		int endIndex = a.length - 1;
		int middle = 0;
		
		while (startIndex <= endIndex)
		{
			middle = (startIndex + endIndex) / 2;
			if (value == a[middle])
			{
				return middle;
			}
			else if (value < a[middle])
			{
				endIndex = middle - 1;
			}
			else
			{
				startIndex = middle + 1;
			}
		}
		return -1;
	}
}
