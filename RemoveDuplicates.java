package week2.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn java basics as part of java sessions in java week1";
		String[] newText=text.split(" ");
		int count=0;
		String temp = null;
		for(int i=0;i<newText.length;i++)
		{
				
			for(int j=i+1;j<newText.length;j++)
			{
				if(newText[i].equals(newText[j]))
				{
					temp=newText[j];
					count++;					
				}
				
			}
			
		}
		if(count>1)
		{
			System.out.println(text.replace(temp,""));
		}
		
}
}