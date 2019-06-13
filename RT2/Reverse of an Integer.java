import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=0,rev=0;
		if(n>=1&&n<=9999999)
		{
		while(n!=0)
		{
		    digit=n%10;
		    rev=rev*10+digit;
		    n=n/10;
		}
		System.out.println("Output is "+rev);
		}
		else if(n==0)
		{
		    System.out.println("Output is 0");
		}
		else if(n<0)
		{
		    System.out.println("Number should be positive");
		}
	}
}
