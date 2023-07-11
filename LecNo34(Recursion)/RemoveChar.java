import java.util.*;
public class RemoveChar {

    static String Printstring(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans=Printstring(s, idx+1);

        char currchr=s.charAt(idx);
        if(currchr!='a'){
                return currchr+smallans;
        }else{
            return smallans;
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s="Durgesh kapade";

        
       System.out.println( Printstring(s,0));
    }
    
}
 