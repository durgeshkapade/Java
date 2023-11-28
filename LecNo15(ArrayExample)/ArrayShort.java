// It is finding the largest and smallest element in an array
// 4-01-2023
import java.util.Arrays;
import java.util.Scanner;
public class ArrayShort {
    public static void main(String [] args) {
        
            Scanner var = new Scanner(System.in); 
            var.close();
            System.out.println("Enter the size of array");
              int n=var.nextInt();

              int []arr=new int[n];

              System.out.println("Entre the "+n+" element");
              for (int i = 0; i < arr.length; i++) {
                arr[i]=var.nextInt();
              }
 //It is used to short the Array........     
                 Arrays.sort(arr);

                // for (int i = 0; i < arr.length; i++) {
                //     System.out.println(arr[i]+" ");
                //   }

                  System.out.println("the Smallest element is "+arr[0]+" The Largest element is "+arr[arr.length-1]);
      
                  var.close();
      }



    }
    

