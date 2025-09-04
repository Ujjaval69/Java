
import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int r=0;
        while(a>0){
            int ld=a%10;
            r=(r*10)+ld;
            
            a=a/10;
        }
        System.out.print(r);
    }
}