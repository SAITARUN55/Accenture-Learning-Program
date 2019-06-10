import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int small=0,big=0,sum=0;
        if(n>2&&n<20)
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            big=a[0];
            small=a[0];
            for(int i=0;i<n;i++)
            {
                if(small>a[i])
                {
                    small=a[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                if(big<a[i])
                {
                    big=a[i];
                }
            }
            sum=big+small;
            System.out.println(sum);
        }
        else
        {
            System.out.println("Invalid size");
        }
    }
}
