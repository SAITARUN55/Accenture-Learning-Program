import java.util.*;
class AsciValue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        for(int i=0;i<4;i++){
            int c=sc.nextInt();
            System.out.println(c+"-"+(char)c);
        }
    }
}
