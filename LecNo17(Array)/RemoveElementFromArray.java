import java.util.*;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the value");
        int val = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

            } else {
                ans[p] = nums[i];
                p++;
            }
        }
        
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]==0){
                break;
            }
            System.out.print(ans[i]+" ");

        }

    }

}
