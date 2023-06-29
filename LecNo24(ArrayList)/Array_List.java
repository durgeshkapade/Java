import java.util.ArrayList;
public class Array_List{
    public static void main(String[] args) {
        
        //Wrapper Class

        // Integer in=Integer.valueOf(4);
        // System.out.println(in);
        // Float f=Float.valueOf(33.4f);
        // System.out.println(f);

        ArrayList<Integer> l1=new ArrayList<>();   //object of Arraylist
  

        //Access index in Array list
        l1.add(2);   //2
        l1.add(4);   //2 4
        l1.add(5);   //2 4 5
        l1.add(6);   //2 4 5 6



        //Get an element at index i
         System.out.print(l1.get(0)+" ");
         System.out.println(l1.get(1)+" ");



         // parint ArrayList By using for loop
         for(int i=0;i<l1.size();i++)
         {
            System.out.println(l1.get(i)+" "); //2 4 5 6
         }
   
         

         //Directly print Array list
         System.out.println(l1);         // [2 4 5 6]



         //Add element at index i
         l1.add(1,20);
         System.out.println(l1);            //[2 20 4 5 6]


         //replace element at index i
         l1.set(1,40);
         System.out.println(l1);           //[2 40 4 5 6]


         //Removing an element at index i
         l1.remove(1);     // 1 is index
         System.out.println(l1);           //[2 4 5 6]


         //Removing an element no
         l1.remove(Integer.valueOf(4));
         System.out.println(l1);            //[2 5 6]


         // cheaking an element is present or not
         boolean ans=l1.contains(5);
         System.out.println(ans);           //true

          
         // if we can not defined type (We can add any thing)
        ArrayList var=new ArrayList<>();
         var.add("Durgesh");
         var.add(5);
         var.add(3.66f);
         System.out.println(var);



    }
}
