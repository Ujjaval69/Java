public class SmallestLetter{
    public static void main(String[] args) {
        char []arr={'c','d','f','j'};
        char target='c';
        char ans=letter(arr,target);
        System.out.print(ans);
        
    }
    static char letter(char[]arr,char c){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>c){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[start%arr.length];

    }
}