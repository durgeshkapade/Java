// 3-11-23
// Previous Greater Element ( Same  as a next Greater element)
import java.util.Stack;

public class SpanOfStock_GFG {

    public static void main(String[] args) {
        
        int arr[] = {10, 4 ,5, 90, 120 ,80};// 1  2  1 2 1  4  7
        int res[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        int n= arr.length;
        res[0]=1;
        st.push(0);
       

        for(int i=1;i<n;i++){
            while(st.size()!=0 && arr[st.peek()]<arr[i] ){
                st.pop();
            }

            if(st.size()==0){
                res[i]=i+1;
                st.push(i);
            }
            else{
                if(arr[st.peek()]>arr[i]){
                    res[i]=i-st.peek();
                    st.push(i);
                }
            }   

        }


        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
