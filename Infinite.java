public class Infinite{
    
    public static void main(String[] args) {
        // arr.length is not allowed
        int []arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.print(ans(arr,target));
        
    }
    static int ans(int []arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return search(arr,target,start,end);
        
    }
    static int search(int []arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
}