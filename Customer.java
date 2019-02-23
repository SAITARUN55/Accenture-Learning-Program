import java.util.*;
class Customer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        String b=sc.nextLine();
        System.out.println("Enter gender:");
        String gen=sc.nextLine();
        System.out.println("Hailing from:");
        String city=sc.nextLine();
        System.out.println("Welcome, "+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gen);
        System.out.println("City:"+city);
    }
}