// 14-11-23
// "9-5+3*4/6"     ---   ans : 6
import java.util.Stack;

// Without Bracket

public class Infix_Expression {
    
    public static void main(String[] args) {
        String str = "9-5+3*4/6";

        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)  num.push(ascii-48);

            else if(op.size()==0)  op.push(ch);

            else{

                if(ch=='+' || ch=='-'){
                    //Work
                    int v2=num.pop();
                    int v1=num.pop();

                    if(op.peek()=='+') num.push(v1+v2);
                    if(op.peek()=='-') num.push(v1-v2);
                    if(op.peek()=='*') num.push(v1*v2);
                    if(op.peek()=='/') num.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }

                if(ch=='*' || ch=='/'){
                    if(op.peek()=='+' || op.peek()=='-'){
                        op.push(ch);
                    }else{

                        int v2=num.pop();
                        int v1=num.pop();

                        if(op.peek()=='*') num.push(v1*v2);
                        if(op.peek()=='/') num.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                }
            } 

        }

        while(num.size()>1){
            int v2=num.pop();
            int v1=num.pop();

            if(op.peek()=='+') num.push(v1+v2);
            if(op.peek()=='-') num.push(v1-v2);
            if(op.peek()=='*') num.push(v1*v2);
            if(op.peek()=='/') num.push(v1/v2);
            op.pop();
        }
        
        System.out.println(num.peek());

    }
}


// with bracket

// public class Infix_Expression {
    
//     public static void main(String[] args) {
//         String str = "9-(5+3)*4/8";

//         Stack<Integer> num = new Stack<>();
//         Stack<Character> op = new Stack<>();

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             int ascii = (int)ch;
//             if(ascii>=48 && ascii<=57)  num.push(ascii-48);

//             else if(op.size()==0 || ch=='(' || op.peek()=='(')  op.push(ch);

//             else{

//                 if(ch==')'){
//                     while(op.peek()!='('){
//                         int v2=num.pop();
//                         int v1=num.pop();

//                         if(op.peek()=='+') num.push(v1+v2);
//                         if(op.peek()=='-') num.push(v1-v2);
//                         if(op.peek()=='*') num.push(v1*v2);
//                         if(op.peek()=='/') num.push(v1/v2);
//                         op.pop();
//                     }
//                     op.pop();
//                 }

//                 if(ch=='+' || ch=='-'){
//                     //Work
//                     int v2=num.pop();
//                     int v1=num.pop();

//                     if(op.peek()=='+') num.push(v1+v2);
//                     if(op.peek()=='-') num.push(v1-v2);
//                     if(op.peek()=='*') num.push(v1*v2);
//                     if(op.peek()=='/') num.push(v1/v2);
//                     op.pop();
//                     op.push(ch);
//                 }

//                 if(ch=='*' || ch=='/'){
//                     if(op.peek()=='+' || op.peek()=='-'){
//                         op.push(ch);
//                     }else{

//                         int v2=num.pop();
//                         int v1=num.pop();

//                         if(op.peek()=='*') num.push(v1*v2);
//                         if(op.peek()=='/') num.push(v1/v2);
//                         op.pop();
//                         op.push(ch);
//                     }
//                 }
//             } 

//         }

//         while(num.size()>1){
//             int v2=num.pop();
//             int v1=num.pop();

//             if(op.peek()=='+') num.push(v1+v2);
//             if(op.peek()=='-') num.push(v1-v2);
//             if(op.peek()=='*') num.push(v1*v2);
//             if(op.peek()=='/') num.push(v1/v2);
//             op.pop();
//         }
        
//         System.out.println(num.peek());

//     }
// }
