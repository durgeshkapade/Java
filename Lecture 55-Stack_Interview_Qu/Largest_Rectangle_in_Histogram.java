// 9-11-23
// 84 - Largest Rectangle in Histogram (largest area ) --- most important
import java.util.Stack;
public class Largest_Rectangle_in_Histogram {

    public static void main(String[] args) {
        int height[]={5,2,4,6,3,5};
        int n= height.length;

        Stack<Integer> st = new Stack<>();
        int nse[]=new int[n];
        int pse[]= new int[n];
// ------------------calculate next smallest element----------------
        st.push(n-1);
        nse[n-1]=n;

        for (int i = n-2; i >= 0; i--) {
            while(st.size()!=0 && height[st.peek()]>=height[i]){
                st.pop();
            }

            if(st.size()==0)
                nse[i]=n;
            else
                nse[i]=st.peek();
            
            st.push(i);
        }
// clear the stack
        st.clear();
// ------------------calculate previous smallest element-------------------

        st.push(0);
        pse[0]=-1;

        for (int i = 1; i < n; i++) {
            while(st.size()!=0 && height[st.peek()]>height[i]){
                st.pop();
            }

            if(st.size()==0)
                pse[i]=-1;
            else
                pse[i]=st.peek();

            st.push(i);
        }

        int Greater=Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int area=height[i]*(nse[i]-pse[i]-1);
            Greater =  Math.max(area, Greater);
        }

        System.out.println(Greater);

    }
    
}
