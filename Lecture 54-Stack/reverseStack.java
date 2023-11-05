
import java.util.Stack;

public class reverseStack {

    public static void pushAtBottom(Stack<Integer> st,int x){

        if(st.size()==0){
            st.push(x);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, x);

        st.push(top);
    }

// Reverse the original stack using recursion    
    public static void reverseUsingRecursive(Stack<Integer> st){
        // base case
        if(st.size()==1) return;

        // recursive work
        int top =st.pop();
        reverseUsingRecursive(st);

        // self work  
        pushAtBottom(st,top);
    }
    
    public static void main(String[] args) {
      
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);


// Reverse the original Stack Using Interative

        // Stack<Integer> gt = new Stack<>();
        // while(st.size()>0){
        //     gt.push(st.pop());
        // }
        // Stack<Integer> pt =new Stack<>();
        // while(gt.size()>0){
        //     pt.push(gt.pop());
        // }
        // while(pt.size()>0){
        //     st.push(pt.pop());
        // }
        // System.out.println(st);

// Reverse Stack Using Recursion

        reverseUsingRecursive(st);
        System.out.println(st);



    }
}
