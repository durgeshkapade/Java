//2-11-23
// Next Greater element
// Best approach

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int []arr={1,3,2,1,8,6,3,4};
        int []res = new int[arr.length];
        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        // last ele have not any greater ele therfore it will be by default -1
        st.push(arr[n-1]);
        res[n-1]=-1;

        for(int i=n-2;i>=0;i--){
            res[i]=-1;
            while(st.size()!=0 && st.peek()<arr[i]){
                st.pop();
            }

            if(st.size()==0) {
                res[i]=-1;
                st.push(arr[i]);
            }else{
                if(st.peek()>arr[i]){
                    res[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
     
}



// Brute force Approach

// public class NextGreaterElement {

//     public static void main(String[] args) {
        
//         int []arr={1,3,2,1,8,6,3,4};

//         int res[]= new int[arr.length];

//         for(int i=0;i<arr.length;i++){
//                 res[i]=-1;
//             for(int j=i+1;j<arr.length;j++){
                
//                 if(arr[j]>arr[i]){
//                     res[i]=arr[j];
//                     break;
//                 }
//             }
            

//         }

//         for (int i = 0; i < res.length; i++) {
//             System.out.print(res[i]+" ");
//         }
//     }
    
// }
