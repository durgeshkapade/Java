//2-11-23
// thr minimum number of bracket that we need to remove to make the given bracket Balance

import java.util.Scanner;
import java.util.Stack;

public class HowRemoveToMakeBalance {

    public static int removeBarcket(String str){

        Stack<Character> st = new Stack<>(); 
        int n = str.length();
        int count=0;

        for(int i=0;i<n;i++){

            char ch = str.charAt(i);

            if(ch=='('){
                st.push(ch);
            }else{

                if(st.size()==0)  continue;

                if(st.peek()=='('){
                    st.pop();
                    count=count+2;
                }
            }

        }


        return n-count;
    }

     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bracket Sequence ");
        String str = sc.next();

        System.out.println(removeBarcket(str));
     }
}