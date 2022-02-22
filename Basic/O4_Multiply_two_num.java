package Basic;
import java.util.Scanner;

public class O4_Multiply_two_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first_number , sec_number,multi;
        System.out.print("Enter First number :");
        first_number=sc.nextInt();
        System.out.print("Enter Second Number :");
        sec_number=sc.nextInt();
        multi=first_number*sec_number;
        System.out.println("Multiply of "+first_number+ " and "+sec_number+ " is " + multi);

    }
    
}
