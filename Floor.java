public class Floor{
    public static void main(String[] args) {
        int []arr={2,3,4,5,9,14,16,17,18};
        int target=15;
        int ans=binary(arr,target);
        System.out.println(ans);
    }

    static int binary(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return arr[end];
    }
}