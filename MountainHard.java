// https://leetcode.com/problems/find-in-mountain-array/description/
public class MountainHard{
    public static void main(String[] args) {
        
    }
    static int BinarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
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
    static int peak(int []arr){
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
    static int Order(int[] arr, int target,int start,int end) {
        
        // 1. Determine if the array is ascending or descending
        // If the first element is less than the last, it's ascending.
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Found the element
            if (arr[mid] == target) {
                return mid;
            }

            // 2. Apply search logic based on array order
            if (isAscending) {
                // Standard Ascending Search (Your original logic)
                if (target < arr[mid]) {
                    end = mid - 1; // Target is in the left half
                } else {
                    start = mid + 1; // Target is in the right half
                }
            } else {
                // Descending Search: Logic is reversed
                if (target > arr[mid]) {
                    end = mid - 1; // Target is now in the left half (smaller values)
                } else {
                    start = mid + 1; // Target is now in the right half (larger values)
                }
            }
        }

        return -1; // Target not found
    }
    static int search(int[]arr,int target){
        int peak=peak(arr);
        int firstTry=Order(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }

    }

}