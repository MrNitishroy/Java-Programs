import java.util.Scanner;

public class O11_Remove_all_whitespaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str=sc.nextLine();

        char[] s1=str.toCharArray();
        StringBuffer s2 =new StringBuffer();
        for(int x=0; x<s1.length;x++)
        {
            if((s1[x]!=' ') && (s1[x]!='\t'))
            {
                s2.append(s1[x]);
            }
        }
        String str1=s2.toString();
        System.out.println("After Elimination Space String is : " + str1);
    }
}
