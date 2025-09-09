
import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         String fruit=input.next();
         switch(fruit){
            //enhanced switch is this
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Grape" -> System.out.println("A small fruit");
            default -> System.out.println("Enter a valid fruit"); 
         }
          

    }
}