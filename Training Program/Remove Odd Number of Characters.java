import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            int a=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    a++;
                }
            }
            if(a%2==0)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
