//3-4-2023
// to find possible combination using keypad......
public class PrintPossiCombi {

    static void combination(String dig, String[] list, String res) {
        if (dig.length() == 0) {
            System.out.println(res + " ");
            return;
        }

        int curr = dig.charAt(0) - '0'; // 2
        String str = list[curr]; // abc

        for (int j = 0; j < str.length(); j++) {
            combination(dig.substring(1), list, res + str.charAt(j));
        }
    }

    public static void main(String[] args) {

        String dig="253";
        String list[]={" " ," " ,"abc" ,"def", "ghi", "jkl" ,"mno" ,"pqrs" ,"tuv" ,"wxyz"};
        //              0    1     2      3      4      5      6       7      8      9
      
        combination(dig, list, "");
        
    }

}
