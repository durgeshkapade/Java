import java.util.Scanner;
public class ReverseString {

    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans=reverse(s,idx+1);

        String ans=smallans+s.charAt(idx);
        return ans;
    }

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println("Reverse of "+s+ " is");
    System.out.println(reverse(s,0));
   }    
}
