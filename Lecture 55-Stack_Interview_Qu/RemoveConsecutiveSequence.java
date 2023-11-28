// 2-11-23
// remove consicutive greater than or equal to 2
// {1,2,2,3,10,10,10,4,7,7,7,2}  -----------  {1,3,4,2}
import java.util.Stack;

public class RemoveConsecutiveSequence {

    public static int[] remove(int[] arr){
        int n= arr.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){

            if(st.size()==0 || st.peek()!=arr[i])
                st.push(arr[i]);
            else if(st.peek()==arr[i]){
                    if(i==n-1 || arr[i]!=arr[i+1]){
                        st.pop();
                    }
                
            }

        }
        
        // for add element int array from stack
        int res[]=new int[st.size()];
        int p=res.length-1;

        while(st.size()>0){
            res[p]=st.pop();
            p--;
        }

        
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,10,10,10,4,7,7,7,2};

        int re[] = remove(arr);

        for(int i=0;i<re.length;i++){
            System.out.print(re[i]+" ");  //--[1,3,4,2]
        }


    }
    
}
