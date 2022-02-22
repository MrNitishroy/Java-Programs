import java.util.Scanner;

public class O10_Frequency_of_a_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str;
        char ch;
        int count=0;
        
        System.out.print("Enter a String : ");
        str=sc.nextLine();
        System.out.print("Enter frequency Char : ");
        ch=sc.nextLine().charAt(0);
        
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                count++;
            }

        }
        System.out.println("Frequency of " + ch + " = " +count);
    }
    
}
