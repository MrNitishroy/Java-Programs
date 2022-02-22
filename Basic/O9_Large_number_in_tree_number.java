
import java.util.Scanner;

public class O9_Large_number_in_tree_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int large;
        System.out.println("Enter three number : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+" is a Large number ");
        }
        if(b>a && b>c)
        {
            System.out.println(b+" is a Large number ");
        }
        System.out.println(c+" is a Large number ");
        
    }
    
}
