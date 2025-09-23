
import java.util.Arrays;

public class Searchin2D{
    public static void main(String[] args) {
        int [][]arr={
            {23,4,11},
            {18,12,3,9},
            {78,99,34,56},
            {1,2}
        };
        int target=34;
        int [] ans=Search(arr,target);
        System.out.print(Arrays.toString(ans));
    }
    static int[] Search(int [][]arr,int target){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}