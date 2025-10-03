
import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int []arr={3,1,5,4,2};
        sort(arr);
        System.out.print(Arrays.toString(arr));
        
    }
    static void sort(int []arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxindex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxindex(int []arr,int start,int end){
        int max=start;
        for (int i=start;i<=end;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}