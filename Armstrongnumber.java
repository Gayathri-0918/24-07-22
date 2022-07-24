package basic1;
import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=in.nextInt();
		int originalnum=num;
		int check=0;
		while(num>0)
		{
			int rem=num%10;
			check=check+(rem*rem*rem);
			num=num/10;
		}
		if(originalnum==check)
		
			System.out.println("It is a Armstrong number");
		else
		{
			System.out.println("It is not Armstrong number");
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
