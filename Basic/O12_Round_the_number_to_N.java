
import java.util.Scanner;

public class O12_Round_the_number_to_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        double n=sc.nextDouble();
        System.out.println("Befor Rounding Your Number is = "+n);
        System.out.format("after Rounding : %.3f",n);
    }
    
}
