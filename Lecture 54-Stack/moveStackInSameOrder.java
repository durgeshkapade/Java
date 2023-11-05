import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        // move to gt stack in reverse order
        while(st.size()>0){
            int x = st.pop();
            gt.push(x);
        }
        System.out.println(gt);

        Stack<Integer> rt = new Stack<>();
         // move to rt stack in reverse order
        while(gt.size()>0){
            int y = gt.pop();
            rt.push(y);
        }

        System.out.println(rt);
    }

}
