import java.util.Stack;

public class PushAtBottomUsingRecusion {

    public static void usingRecursiveAtBottom(Stack<Integer> st,int x){
        // base case
        if(st.size()==0) {
            st.push(x);
            return;
        }

        // Recursive work
        int p = st.pop();
        usingRecursiveAtBottom(st, x);

        // self work
        st.push(p);

    }

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        usingRecursiveAtBottom(st,0);

        System.out.println(st);
    }
    
}
