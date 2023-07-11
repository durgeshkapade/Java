//30-03-23    bettre than previous
//cheak palindrome or not
// Tc=O(n)   travling with string and cheak first and last idx;
import java.util.Scanner;
public class palindromeStrCheak1 {

    static boolean palindrome(String s,int l,int r){
        if(l>=r){
            return true;
        }

        return(s.charAt(l)==s.charAt(r) && palindrome(s, l+1, r-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(palindrome(s,0,s.length()-1));
    }
    
}
