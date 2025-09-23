public class Mininum{
    public static void main(String[] args) {
        int [] arr={1,-2,3,4,5};
        System.out.print(Min(arr));

        
    }
    static int Min(int [] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
}