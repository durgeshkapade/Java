import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> i=new ArrayList<>();

        System.out.println("Enter the size of Array list");
        int n=sc.nextInt();
        
        System.out.println("Entre the "+ n +" Element");
        for (int j = 0; j < n; j++) {
            i.add(sc.nextInt());
            
        }

        for (int j = 0; j < n; j++) {
            System.out.print(i.get(j)+" ");
        }

       
    }
    
}
