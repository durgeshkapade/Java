import java.util.*;
public class CountDigit {
    //  static int i=0;

    //  static int CD(int no){
        
    //     i++;
    //     if(no>=0&&no<=9)
    //         return i;
        
    //     CD(no/10);

    //     return i;
    // }


    static int num(int no){
        // base case =if the number is less than 10 ;it has only one digit
        if(no<10){
            return 1;
        }else{    //recrsive case =add 1 to the num int the number with last digit removed
            return 1+num(no/10);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the Number ");
        int no=sc.nextInt();

        //int i=CD(no);
        //System.out.println("Number of Digit is "+i);

        int i=num(no);
        System.out.println("Yhe numbre of digit is "+i);


    }
    
}
