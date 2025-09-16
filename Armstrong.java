
import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int org=n;
        int sum=0;
        
        while(org>0){
            int ld=org%10;
            sum=sum+Power(ld,count);
            org=org/10;

        }
        if (sum==n){
            System.out.print(n +" is an armstrong number");
        }else{
            System.out.print(n+ " is not an armstrong number");
        }

    }
    static int Power(int base,int exp){
        if(exp==0){
            return 1;
        }
        return base*Power(base,exp-1);
    }
}