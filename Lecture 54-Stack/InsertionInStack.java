import java.util.Stack;

public class InsertionInStack {

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        // insert 50 at 2 index
        int idx = 2;
        int x = 50;
        Stack<Integer> rt =new Stack<>();

        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);
        
    }
    
}
