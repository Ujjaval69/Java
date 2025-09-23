public class Linearsearch{
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int target=3;
        int x=Search(arr,target);
        if (x!=-1){
            System.out.print("Found at index: "+x);
        }
        else{
            System.out.print("Not found");
        }
        
        
    }
    static int Search(int[]arr,int x){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x){
                return i;
                
            }
            
            
        }
        return -1;


    }
}