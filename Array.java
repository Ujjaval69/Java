
import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        int n;
       
        Scanner in=new Scanner(System.in);
         n=in.nextInt();
        int [] rno=new int[n];
        for (int i=0;i<n;i++){
            rno[i]=in.nextInt();
        }
        //for each loop
        // for (int num: rno){
        //     System.out.print(num+ " ");
        // }
        System.out.print(Arrays.toString(rno)); //best method string method

        
        

    }
}