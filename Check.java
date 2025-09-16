
import java.util.Scanner;

public class Check{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char a=in.next().trim().charAt(0);
        if (a>='a' && a<='z'){
            System.out.println("Alphabet");
        }
        else if (a>='A'&& a<='Z'){
            System.out.println("Alphabet");
            
        }
        else if (a>='0' && a<='9'){
            System.out.println("Number");

        }
        else{
            System.out.println("special");
        }
    }
}