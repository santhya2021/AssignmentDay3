package week2.day1;

public class PrintDuplicateInArray {

	public static void main(String[] args) 
	{
		
		
		// TODO Auto-generated method stub
		int num[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println("The duplicate values in the array are:");
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[i]);
				}
			}
		}

	}

}
