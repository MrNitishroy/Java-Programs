package Basic;

import java.util.Scanner;

public class O3_Add_two_Number {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int first_number , sec_number,add;
        System.out.print("Enter First number :");
        first_number=sc.nextInt();
        System.out.print("Enter Second Number :");
        sec_number=sc.nextInt();
        add=first_number+sec_number;
        System.out.println("Sum of "+first_number+ " and "+sec_number+ " is " + add);

    }
    
}
