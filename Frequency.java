public class Frequency{
    public static void main(String[] args) {
         int n=123212312;
         int count=0;
         while(n>0){ 
            int rem=n%10;
            if (rem==2){
                count++;
            }
            n=n/10;
         }
         System.out.print(count);

    }
}