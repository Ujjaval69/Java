public class Nto1{
    public static void main(String[] args) {
        series(5);
        
    }
    static void series(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        series(n-1);
    }
}