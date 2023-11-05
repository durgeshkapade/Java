import java.util.Stack;

public class DisplayStack {

    public static void recursiveDisplay(Stack<Integer> st){
        // base case
        if(st.size()==0) return;

        // recursive work
        int x =st.pop();
        recursiveDisplay(st);

        // self work  
        System.out.print(x+" ");
        st.push(x);
    }

    public static void recursiveDisplayReverse(Stack<Integer> st){
        // base case
        if(st.size()==0) return;

        // recursive work
        int x =st.pop();
        System.out.print(x+" ");
        recursiveDisplayReverse(st);

        // self work  
        st.push(x);
    }
    
    public static void main(String[] args) {
      
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

// Display Using stack

        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //     int x =rt.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }

// Reverse the original Stack

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

// Display Using Array
        
        // int n = st.size();
        // int arr[]=new int[n];
        // for(int i=n-1;i>=0;i--){
        //     arr[i]=st.pop();
        // }

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }

        // System.out.println("\n"+st);


// Display Using Recursion
        
        // recursiveDisplay(st);
        // System.out.println("\n"+st);
        
// Display Reverse Using Recursion
        
        // recursiveDisplayReverse(st);
        // System.out.println("\n"+st);        
    }
}
