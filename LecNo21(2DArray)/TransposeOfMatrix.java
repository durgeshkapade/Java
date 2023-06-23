import java.util.*;
public class TransposeOfMatrix {

    static int[][] Transepose(int [][]a,int r,int c){
        int [][]ans=new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                  
                 ans[j][i]=a[i][j];              
                
            }
            
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Rows and coloums of fist matix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int [r][c];
        System.out.println("enter the Matrix "+r*c+" Element");
            for (int i = 0; i < r; i++) 
          {
            for (int j = 0; j < c; j++) 
            {
                a[i][j]=sc.nextInt();
                
            }
        }

        int [][]ans=Transepose(a,r,c);

        System.out.println("The Transepose of matrix is");
        for (int i = 0; i < c; i++) 
        {
            for (int j = 0; j < r; j++) 
            {
                System.out.print(ans[i][j]+"  ");
                
            }
          
            System.out.println();
        }

    }
    
}
