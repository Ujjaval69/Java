public class BinarySearch2{
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,2,1};
        int target=3;
        int ans=search(arr,target);
        System.out.print(ans);

        
    }
    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;

            }
            else{
                return mid;
            }

        }
        return -1;

    }

}