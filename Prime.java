
import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(Check(n));

    }
    static boolean Check(int n){
        if (n==0||n==1){
            return false;
        }
        if (n==2){
            return true;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}