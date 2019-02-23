import java.util.*;
class CarDetails{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car name:");
        String name=sc.nextLine();
        System.out.println("Enter the car no:");
        int num=sc.nextInt();
        System.out.println("Enter the price:");
        double p=sc.nextDouble();
        String pr=String.format("%.2f",p);
        System.out.println("Carname:"+name);
        System.out.println("Carno:"+num);
        System.out.println("Price:"+pr+" rs only");
    }
}