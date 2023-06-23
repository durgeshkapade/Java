import java.util.*;
public class RotateBy90Degre {

    static void Transepose(int a[][],int r,int c){
        
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }        
    }
    static void ReverseArray(int a[]){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    static void RotateArray(int [][]a,int n){

        Transepose(a,n,n);
        //first transpose then reverse row
        for (int i = 0; i < a.length; i++) {
            ReverseArray(a[i]); //reverse row one by one
        }

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

        RotateArray(a, r);
        
        System.out.println("Rotate by 90 degree  matrix is");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(a[i][j]+"  ");
                
            }
          
            System.out.println();
        }
    }
    
}
