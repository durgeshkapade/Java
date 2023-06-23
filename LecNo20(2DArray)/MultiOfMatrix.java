import java.util.*;
public class MultiOfMatrix {

    static void MultMatrix(int [][]a,int r1,int c1,int [][]b,int r2,int c2){
        int [][]Mul=new int[r1][c2];
        if(c1!=r2){
            System.out.println("invalid input :Addition not possible");
            return;
        }
        
            for (int i = 0; i < r1; i++) 
            {
              for (int j = 0; j < c2; j++) 
              {           //Or k < r2
                for(int k = 0; k < c1; k++){
                  /*
                   mult[i][j]= (ith row of a)* (jth coloumn of b)
                   */
                   Mul[i][j]+=a[i][k]*b[k][j];
                }
              }
            }

            System.out.println("The multiplication of matrix is");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    System.out.print(Mul[i][j]+"  ");
                    
                }
              
                System.out.println();
            }

   }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Rows and coloums of fist matix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]a=new int [r1][c1];
        System.out.println("enter the first "+r1*c1+" Element");
            for (int i = 0; i < r1; i++) 
          {
            for (int j = 0; j < c1; j++) 
            {
                a[i][j]=sc.nextInt();
                
            }
        }

        System.out.println("Enter the Rows and coloums of second matix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]b=new int [r2][c2];

       System.out.println("enter the Second "+r2*c2+" Element");
            for (int i = 0; i < r2; i++)  {
              for (int j = 0; j < c2; j++) 
              {
                b[i][j]=sc.nextInt();
                
              }
           }

           MultMatrix(a,r1,c1,b,r2,c2);
    }
    
}
