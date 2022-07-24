package basic1;
import java.util.Scanner;

public class Palindromnumber {

	public static void main(String[] args) 
	{
		int rem,sum=0,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		temp=n;
		while(n>0)
{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
}
if(temp==sum)

	System.out.println("the number is palindrome");

else

	System.out.println("the number is not palindrome");

	}

}
