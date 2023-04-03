package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int data[]= {3,2,11,4,6,7};
		Arrays.sort(data);
		int arrayLength = data.length;
		System.out.println("The given Array is:");
		for(int i=0;i<arrayLength;i++)
		{
			System.out.println(data[i]);
		}
		System.out.println("The second heighest number in the array is:"+data[arrayLength-2]);
	}

}
