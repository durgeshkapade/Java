// 1-10-23
import java.util.Stack;

public class basicOfStack {
    public static void main(String[] args) {
        
        // ArrayList<Integer> ar  =new ArrayList<>();

// Representaion of stack         
        Stack<Integer> st = new Stack<>();

// push() means adding element in stack
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);

// Print all the stack        
        System.out.println(st);

// For Removing the element        
        // st.pop();
        // System.out.println(st);
        st.pop();
        System.out.println(st);

// Size of stack        
        System.out.println("Size of Stack is: "+st.size());

// Accesing 2 element then removing all element up to 2 element        
        while(st.size()>2){
            st.pop();
        }

// peek() is used to access top most element of stack
        System.out.println(st.peek());




    }
    
}
