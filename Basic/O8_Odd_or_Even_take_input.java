import java.util.Scanner;

public class O8_Odd_or_Even_take_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        if(30%2==0)
        {
            System.out.println(num+" is Even Number");
        }
        else
        {
            System.out.println(num+" is Odd number");
        }
    }
    
}
