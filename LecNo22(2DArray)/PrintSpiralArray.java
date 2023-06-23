import java.util.*;
public class PrintSpiralArray {

    static int[][] Spiral(int n){

        int [][]arr=new int [n][n];
        int toprow=0,bottomrow=n-1,leftcol=0,rightcol=n-1;
        int curr=1;

        while(curr<=n*n){
            //top row= left col --- rihgt col
            for (int j = leftcol; j <= rightcol && curr<=n*n; j++) {
                arr[toprow][j]=curr++;
            }
            toprow++;
            
            //right coloumn=top row ---bottom row
            for (int i = toprow; i <= bottomrow && curr<=n*n; i++) {
              arr[i][rightcol]= curr++;
            }
            rightcol--;

            //bottom row =right col----left col
            for (int j = rightcol; j >= leftcol &&curr<=n*n; j--) {
                arr[bottomrow][j]=curr++;
            }
            bottomrow--;

            //left col= bottom row -----top row
            for (int i = bottomrow; i >= toprow && curr<=n*n; i--) {
                arr[i][leftcol]= curr++;
            }
            leftcol++;

            
        }
        return arr;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        
        int [][]arr= Spiral(n);
        System.out.println("The Spiral  matrix is");
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

    

