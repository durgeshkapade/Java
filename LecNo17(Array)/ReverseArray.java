
public class ReverseArray {

    static int[] Rev(int arr[]){

        int []ans=new int[5];
        int j=0;
        for (int i = arr.length-1; i >=0; i--) {
            
                ans[j++]=arr[i];                
            
            //j++;
        }
        return ans;

    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};

         int []ans= Rev(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);            
        }
    }
    
}
