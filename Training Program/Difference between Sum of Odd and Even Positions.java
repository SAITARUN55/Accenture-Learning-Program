import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0,even=0;
        if(n>2&&n<20)
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    even=even+a[i];
                }
                if(i%2!=0)
                {
                    odd=odd+a[i];
                }
            }
           int difference;
            difference=odd-even;
            System.out.println(difference);
        }
        else
        {
            System.out.println("Invalid array size");
        }
    }
}
