import java.util.Scanner;

public class O6_Quotient_or_remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float first,sec,quo,rem;
        System.out.print("Enter First number : ");
        first = sc.nextFloat();
        System.out.print("Enter second number : ");
        sec = sc.nextFloat();
        quo=first/sec;
        rem=first%sec;
        System.out.println("Quotient of "+first+" / "+sec+" is "+ quo);
        System.out.println("Remainder of "+first+" % "+sec+" is "+ rem);
        
    }
    
}
