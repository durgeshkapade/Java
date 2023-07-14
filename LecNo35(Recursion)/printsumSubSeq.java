//1-04-2023
//to find sum of sun sequences
//[2,4,5] [2,4] [2,5] [2] [4,5] [4] [5] [ ]
//  11     6     7    2     9    4   5   0
public class printsumSubSeq {

    static void printsum(int[]a,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
            printsum(a, n, idx+1, sum+a[idx]);
            printsum(a, n, idx+1, sum);
        
    }
    public static void main(String[] args) {
        int[]a={2,4,5};
        printsum(a,a.length,0,0);
    }
    
}
