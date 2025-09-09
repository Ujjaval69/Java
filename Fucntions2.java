
import java.util.Scanner;

public class Fucntions2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=sum(a,b);
        System.out.println(c);
        
    }
    static int sum(int a,int b){
        int sum=a+b;
        return sum;

    }
}