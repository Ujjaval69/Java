
import java.util.Arrays;

public class Bubblesortcount{
    public static void main(String[] args) {
        int []arr={1,4,5,6,3};
        int count=count(arr);
        
        System.out.println(Arrays.toString(arr));
        System.out.print(count);
        
    }
    static int count(int []arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    count++;
                }

            }
           
        }
        return count;
    }
}