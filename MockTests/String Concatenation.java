import java.util.Scanner;
public class Main{
    
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int diff=0;
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int l=s1.length();
        int n=s2.length();
        if(l==n)
        {
            System.out.println(s1+s2);
        }
        else if(l<n)
        {
            diff=n-l;
            s2=s2.substring(diff);
            System.out.print(s1+s2);
        }
        else if(l>n)
        {
            diff=l-n;
            s1=s1.substring(diff);
            System.out.print(s1+s2);
        }
       
    }
}
