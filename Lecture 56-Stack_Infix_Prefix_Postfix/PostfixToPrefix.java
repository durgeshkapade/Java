// 14-11-23
// "953+4*6/-"     ---   ans : -9/*+5346
import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        
        String postfix = "953+4*6/-";   //-9/*+5346

        Stack<String> val = new Stack<>();

        for (int i = 0; i <postfix.length(); i++) {
            char ch = postfix.charAt(i); //'6'
            int ascii = (int)ch;   
            String s = ""+ch;  //"6"
            if(ascii>=48  && ascii<=57){
                val.push(s);
            }else{

                String v2=val.pop();
                String v1=val.pop();
                String o = ""+ch;  // operator convert to string
                val.push(o+v1+v2);
                
            }

        }

        System.out.println(val.peek());
    }
}