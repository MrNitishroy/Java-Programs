import java.util.*;

public class O5_ASCII_Value {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Char :");
        char latter = sc.next().charAt(0);
        int ASCII=latter;
        System.out.println("ASCII value of "+latter+" is "+ASCII);
    }
    
}
