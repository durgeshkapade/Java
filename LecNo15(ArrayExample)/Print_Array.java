import java.util.Scanner;

public class Print_Array{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int p=0,y=0;
        int var[]=new int[100];
            
        for (int i = 0; i < var.length; i++) {
            var[i]=Sc.nextInt();
            if (var[i]==p) {
                break;
             }
             y++;
        }
        for (int i = 0; i < y; i++) {
            System.out.println(var[i]+" ");
        }            
        
    }
}