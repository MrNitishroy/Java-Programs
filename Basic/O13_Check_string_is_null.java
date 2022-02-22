import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class O13_Check_string_is_null {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        
        if(str==null)
        {
            System.out.println("String is Null ");
        }else if(str.isEmpty())
        {
            System.out.println("String is Empty");
        }
        else{
            System.out.println("Good String");
        }
    }
    
}
