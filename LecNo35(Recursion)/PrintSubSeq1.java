//1-04-2023
// print sub Sequence of "abc"            2 type
public class PrintSubSeq1 {

    static void SSQ(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }

        char curr=s.charAt(0);
        String remstring=s.substring(1);

        SSQ(remstring, currAns+curr);
        SSQ(remstring, currAns);

    }


    public static void main(String[] args) {
        SSQ("abc", "");
    }
    
}
