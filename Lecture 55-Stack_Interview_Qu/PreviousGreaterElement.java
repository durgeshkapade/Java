// 3-11-23
// Previous Greater Element ( Same  as a next Greater element)
import java.util.Stack;

public class PreviousGreaterElement {

    public static void main(String[] args) {
        
        int arr[] = {100,80,60,70,60,75,85};
        int res[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int n= arr.length;

        res[0]=-1;

        for(int i=1;i<n;i++){
            while(st.size()!=0 && st.peek()<arr[i]){
                st.pop();
            }

            if(st.size()==0){
                res[i]=-1;
                st.push(arr[i]);
            }else{
                res[i]=st.peek();
                st.push(arr[i]);
            }


        }


        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
