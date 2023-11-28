//  Cycle sort 
// TC :- O(n)
// this is only applicable for 1 to n element is present
public class CycleSort {
    public static void main(String[] args) {
        
        // int []arr = {3,5,2,1,4};
        int []arr = {4,3,2,7,8,2,3,1};
        int i=0;
        while(i<arr.length){
            
             //what was the correct position of current elemnt
             // the corrct position is (that no -1) 
            int correct = arr[i]-1;

            //check if current positon is not same as the correct position
            // then element is not the fix ( then i will swap)
            if(correct != i){

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }

    }
}
 