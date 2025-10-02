public class EvenDigits{
    public static void main(String[] args) {
        
    }
    static int Digits(int []n){
        int count=0;
        for (int i=0;i<n.length;i++){
            if (even(n[i])){
                count++;
            }

        }
        return count;
        
    }
    static int count(int n){
        if (n<0){
            n=n*-1;
        }
        if (n==0){
            return 1;
        }
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    static boolean even(int n){
        int numberofdigits=count(n);
        return numberofdigits%2==0;
    }
}