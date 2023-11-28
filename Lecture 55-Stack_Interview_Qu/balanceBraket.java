// 1-10-23
// balance Bracket

import java.util.Scanner;
import java.util.Stack;

public class balanceBraket {

    static boolean barcket(String str){

        Stack<Character> st = new Stack<>();

        int n=str.length();

        if(str.length()%2!=0){
            return false;
        }

        for(int i=0;i<n;i++){
            char ch =str.charAt(i);

            if(ch=='('){
                st.push('(');

            }else {
                if(st.size()==0)  return false;

                if(st.peek()=='(') st.pop();
             }
        }

        if(st.size()==0){
            return true;
        }

        return false;

    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bracket Sequence ");
        String str = sc.next();

        System.out.println(barcket(str));

        
    }
}
