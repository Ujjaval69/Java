import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
public class smax{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            
        }
        int max=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
                
            }
        }
        System.out.print(smax);
        // Write your code here
    }
}