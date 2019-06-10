import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int d=(s.length()/2);
        for(int i=d;i<s.length();i++)
        {
            if(i==d)
            {
                Character e=Character.toUpperCase(s.charAt(i));
                System.out.print(e);
            }
            else
            {
                Character e=Character.toLowerCase(s.charAt(i));
                System.out.print(e);
            }
        }
    }
}
