
import java.util.Arrays;
import java.util.Scanner;

public class Array1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String [] arr=new String[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=in.next();
        }
        System.out.print(Arrays.toString(arr));

    }
}