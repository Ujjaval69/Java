
import java.util.Stack;

public class Stacks{
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(45);
        st.push(32);
        st.push(12);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());



    }
    
}