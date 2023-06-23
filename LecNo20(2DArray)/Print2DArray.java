import java.util.*;
public class Print2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Rows");
        int r=sc.nextInt();
        System.out.println("Enter the coloums");
        int c=sc.nextInt();

        int [][]arr=new int [r][c]; 

        // int [][]arr={{1,2,3},
        //              {4,6,7},
        //              {3,9,2}};
        System.out.println("Enter "+ r*c +" Element");
        
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                arr[i][j]=sc.nextInt();
                
            }
            
        }

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.print(arr[i][j]+"  ");
                
            }
          
            System.out.println();
        }







    }
    
}
