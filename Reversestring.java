package basic1;
import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name ");
		char[] name=obj.nextLine().toCharArray();
		System.out.println("reverse string");
		for(int i=name.length-1;i>=0;i--)
		{
			
			System.out.print(name[i]);
		
		}
		
		

	}

}
