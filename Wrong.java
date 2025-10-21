import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
public class Wrong{
    static int Sum(int n){
        if (n<0){
            return -Sum(n);
        }
        if (n==0){
            return 0;
        }
        return n%10+Sum(n/10);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=Sum(n);
        System.out.println(ans);
        // Write your code here
    }
}