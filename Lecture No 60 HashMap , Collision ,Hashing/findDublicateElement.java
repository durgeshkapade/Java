import java.util.*;
public class findDublicateElement{
    public static void main(String[] args) {
        
        Map<Integer, Integer>  mp = new HashMap<>();

        int arr[] = {1,2,3,4,4,4,1,4,1};
        for(int ele : arr){
            if(!mp.containsKey(ele)){
                mp.put(ele,1);
            }else{
                mp.put(ele , mp.get(ele)+1);
            }         
        }

        int max = 0;
        int ans = 0;
        for(var e : mp.entrySet()){
            if(e.getValue()>max){
                max = e.getValue();
                ans = e.getKey();
            }
        }

        System.out.println(ans + "  Occurs "+mp.get(ans)+" Times");

        System.out.println(mp.entrySet());

    }
}