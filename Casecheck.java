
import java.util.Scanner;

public class Casecheck{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        //trim is used to remove the unwanted spaces
        if (ch>='a' && ch<='z'){
            System.out.print("Lowercase");
        }else{
            System.out.print("Uppercase");
        }
       
    }
}