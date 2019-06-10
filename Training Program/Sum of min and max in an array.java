import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>2&&a<20)
        {
            int b[]=new int[a+1];
            b[0]=a;
            for(int i=1;i<b.length;i++)
            {
                b[i]=sc.nextInt();
            }
            Arrays.sort(b,1,b.length);
            System.out.print(b[1]+b[a]);
        }
        else
        {
            System.out.print("Invalid size");
        }
    }
}
