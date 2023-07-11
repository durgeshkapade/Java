import java.util.*;
public class StringInfo {

    public static void main(String []args){
    
        Scanner sc=new Scanner(System.in);
        // String s="Durgesh";
        // System.out.println(s);

        System.out.println("Enter your Name");
        String p=sc.nextLine();
        System.out.println(p);

        char ch=p.charAt(0);
        System.out.println(ch);

        for (int i = 0; i < p.length(); i++) {
            System.out.print(p.charAt(i)+" ");
        }

        System.out.println("\n"+p.substring(2,4));
        System.out.println("\n"+p.substring(2));



    }
}
