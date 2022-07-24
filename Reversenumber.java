package basic1;
import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args)
	{
		int rem,reverse=0,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
		}
		System.out.println("The Reverse number is="+reverse);

	}

}
