public class Pattern1{
    public static void main(String[] args) {
        pattern(4);
        
    }
    static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //when one row is printed add one new line
            System.out.println();

        }

    }
}