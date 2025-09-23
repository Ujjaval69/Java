public class Stringsearch{
    public static void main(String[] args) {
        String str="ujjaval";
        char t='u';
        System.out.print(Search(str,t));
        
    }
    static boolean Search(String str,char target){
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;

    }
}