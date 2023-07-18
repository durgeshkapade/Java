//Bubble sort  8 6 9 4 7  ------>  4 6 7 8 9 
//8-6-23
// use flag for optimize the code (not required flag)
public class BubbleSort
{
    
    static void Bool(int []a){
        for (int i = 0; i < a.length-1; i++) {
            boolean flag =false;   // has swapping  happen
            
            for (int j = 0; j < a.length-1-i; j++) {
                /*last i element is already correct sorted
                 position there is no need to check again  */
               if(a[j]> a[j+1]) {
                   int swap=a[j];
                   a[j]=a[j+1];
                   a[j+1]=swap;
                   
                   flag=true;  // swap will be happen
               }
            }
            
            if(flag=false){ // if swapping not happen it means the array is already sorted
                return;
            }
            
        }
        
    }
    public static void main(String[] args) {
        
        int []a={8,4,6,9,5,7};
        Bool(a);
        
        for (int i:a) {
            System.out.print(i+" ");
            
        } 
    }
}
