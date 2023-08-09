// String Problem..................
// String Compress
// "aaabbbccdddd"   ----->    output = a3b3c2d4
//21-7-23
// public class StringCompressEx {
// 	public static void main(String[] args) {
		
// 		String str ="aaabbbccdddd";
// 		String ans ="";
// 		int count=0;

// 		for (int i = 1; i < str.length(); i++) {
			
// 			char curCh = str.charAt(i);
// 			char preCh = str.charAt(i-1);
// 			if(preCh==curCh){
// 				count++;
// 			}else{
// 				count++;
// 				ans = ans + preCh; 
// 				ans = ans + count;
// 				count=0;
// 			}
// 		}
// 		count++;
// 		ans = ans + str.charAt(str.length()-1) + count;
// 		System.out.println(ans);  // a3b3c2d4
// 	}
	
// }


public class StringCompressEx{
	public static void main(String[] args) {
		
	
		char chars[]={'a','a','b','b','c','c','c'};
        
        String ans="";
        
        int count=1;
        // if(chars.length==1)
        //     return 1;

        for(int i=1;i<chars.length;i++){
            char preCh =chars[i-1];
            char curCh =chars[i];
            if(preCh==curCh){
                count++;
            }else{
                
                ans+=preCh;
                ans+=count;
                count =1;
            }
        }
        
        ans+=chars[chars.length-1];
        ans+=count;

       System.out.println(ans);

    }
}