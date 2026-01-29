
import java.util.Scanner;

public class Case{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("Upper Case");
        }else if(ch>='a'&& ch<='z'){
            System.out.println("Lower case");
        }else{
            System.out.print("Not an alphabet");
        }
    }
}