import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2="";
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
		    char a=s1.charAt(i);
		    if(i%2==0)
		    {
		        s2+=a;
		    }
		    else
		    {
		        s3+=a;
		    }
		}
		System.out.print(s2+" "+s3);
		int even=0,odd=0;
		for(int i=0;i<s1.length()/2;i++)
		{
		    if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u'||s2.charAt(i)=='A'||s2.charAt(i)=='E'||s2.charAt(i)=='I'||s2.charAt(i)=='O'||s2.charAt(i)=='U')
		    {
		        even++;
		    }
		    if(s3.charAt(i)=='a'||s3.charAt(i)=='e'||s3.charAt(i)=='i'||s3.charAt(i)=='o'||s3.charAt(i)=='u'||s3.charAt(i)=='A'||s3.charAt(i)=='E'||s3.charAt(i)=='I'||s3.charAt(i)=='O'||s3.charAt(i)=='U')
		    {
		        odd++;
		    }
		    
		}
		if(even>odd)
		{
		    System.out.println(even);
		}
		else
		{
		    System.out.println(odd);
		}
	}
}
