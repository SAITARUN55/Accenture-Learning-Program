import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.replaceAll("[AaEeIiOoUu]","");
        System.out.print(s1);
    }
}
