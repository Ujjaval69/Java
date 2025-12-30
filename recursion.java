public class recursion{
    public static void main(String[] args) {
        System.out.print(power(2,3));
        
    }
    static int power(int base,int power){
        if (power==0){
            return 1;
        }
        return base*power(base,power-1);
    }
}