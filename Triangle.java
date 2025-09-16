
import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if ((a+b>c)&& (a+c>b) && (b+c)>a){
            if (a==b && b==c){
            System.out.println("Equilateral");
        }
        else if (a==b || b==c || a==c){
            System.out.println("Isoceles");
        }
        else{
            System.out.println("Scalene");
        }

        }
        else{
            System.out.println("invalid triangle");
        }
        

    }
}