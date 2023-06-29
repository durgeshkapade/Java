
import java.util.ArrayList;

public class ReverseArrayLIst {


    static void ReverseList(ArrayList<Integer> list){
        int i=0,j=list.size()-1;

        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        
        System.out.println("Before Reverse");
        System.out.println(list);
       // Collections.reverse(list);                          This is In build clss which can reverse..
        ReverseList(list);

        System.out.println("After Reverse");
        System.out.println(list);

    }
    
}

