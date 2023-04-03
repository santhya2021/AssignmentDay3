package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] changeCase=test.toCharArray();
		for(int i=0;i<changeCase.length;i++)
		{
			if(i%2!=0)
			{
				changeCase[i]=Character.toUpperCase(changeCase[i]);
				System.out.println(changeCase[i]);
			}
			else
				System.out.println(changeCase[i]);
		}
	}

}
