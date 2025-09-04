
import java.util.Scanner;

public class Condition{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float s=input.nextFloat();
        float bonus=0;
        if (s>20000){
            bonus=0.1f*s;
        }else{
            bonus=0;
        }
        System.out.print("Total Salary is "+(s+bonus));

    }
}