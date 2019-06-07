import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
		    int a=((int)s.charAt(i))+1;
		    System.out.print((char) a);
		}
	}
}
