import java.util.*;

public class PalindromeStrCheak{

  static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans=reverse(s,idx+1);

        String ans=smallans+s.charAt(idx);
        return ans;
    }

    public static void main(String[] args) {
    System.out.println("Enter any name");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String rev=reverse(s,0);
    
    if(rev.equals(s)){                 // for compare string
        System.out.printf("%s is palindrome",s);
    }else{
        System.out.printf("%s is not palindrome",s);
    }

    }
}


