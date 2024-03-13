// 14-11-23
// "-9/*+5346"     ---   ans : 953+4*6/-
import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        
        String prefix = "-9/*+5346";   //953+4*6/-

        Stack<String> val = new Stack<>();

        for (int i = prefix.length()-1; i >= 0; i--) {
            char ch = prefix.charAt(i); //'6'
            int ascii = (int)ch;   
            String s = ""+ch;  //"6"
            if(ascii>=48  && ascii<=57){
                val.push(s);
            }else{

                String v1=val.pop();
                String v2=val.pop();
                String o = ""+ch;  // operator convert to string
                val.push(v1+v2+o);
                
            }

        }

        System.out.println(val.peek());

    }
}
