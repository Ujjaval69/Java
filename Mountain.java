public class Mountain{
    public static void main(String[] args) {
        int []arr={1,2,3,6,5,4};
        int ans=Search(arr);
        System.out.print(ans);
        
    }
    static int Search(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}