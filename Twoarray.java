
import java.util.Arrays;
import java.util.Scanner;

public class Twoarray{
    public static void main(String[] args) {
        int [][] arr =new int[3][3];
        Scanner in=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        // for (int i=0;i<3;i++){
        //     for (int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println("");
        // }
        // for(int k=0;k<arr.length;k++){
        //     System.out.println(Arrays.toString(arr[k]));

        // }
        for (int [] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}