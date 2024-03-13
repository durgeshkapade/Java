// 14-11-23
// "9-(5+3)*4/8"     ---   ans : 953+4*6/-
import java.util.Stack;

public class InfixToPostfix {
    
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";


        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i); // '9'
            int ascii = (int)ch;  //57
            if(ascii>=48 && ascii<=57){   // 0 to 9
                String s = ""+ ch;
                val.push(s);        //"9"
            }  

            else if(op.size()==0 || ch=='(' || op.peek()=='(')  op.push(ch);

            else{

                if(ch==')'){
                    while(op.peek()!='('){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o = op.pop();
                        String t= v1+v2+o;
                        val.push(t);
                    }
                    op.pop();
                }

                if(ch=='+' || ch=='-'){
                    //Work
                    String v2=val.pop();
                    String v1=val.pop();
                    char o = op.pop();
                    String t= v1+v2+o;
                    val.push(t);
                    op.push(ch);
                }

                if(ch=='*' || ch=='/'){
                    if(op.peek()=='+' || op.peek()=='-'){
                        op.push(ch);
                    }else{

                        String v2=val.pop();
                        String v1=val.pop();
                        char o = op.pop();
                        String t= v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    }
                }
            } 

        }

        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o = op.pop();
            String t= v1+v2+o;
            val.push(t);
        }
        
        String postfix = val.pop();
        
        System.out.println("Infix Expression is   : "+infix);
        System.out.println("Postfix Expression is : "+postfix);

    }


}
