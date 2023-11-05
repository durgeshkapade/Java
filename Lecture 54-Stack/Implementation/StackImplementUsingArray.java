package Implementation;
public class StackImplementUsingArray {
	
	public static class Stack{
		
		private int[] arr = new int[4];
		private int idx = 0;
		
		void push(int x) {
			if(isFull()) {
                System.out.println("Stack is full... You can't add "+x);
			}else{              
				arr[idx]=x;
				idx++;
            }
		}
		
		int peek() {
			if(idx==0) {
				System.out.println("The Stack is empty");
				return -1;
			}
			
            return arr[idx-1];			
		}
		
		int pop() {
            if(idx==0){
                System.out.println("The Stack is empty");
				return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;			
		}

        void Display(){
            for(int i = 0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        Boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }

        Boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }

        int size(){
            return idx;
        }
		
	}

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push(2); 
        st.Display(); //2
		st.push(4); 
        st.Display(); // 2  4
		st.push(5);
		st.Display(); // 2  4  5
		
        System.out.println(st.size()); //3

        st.pop();
        st.Display(); //2  4
        System.out.println(st.size()); // 2

        st.push(7); // 2  4  7
        st.push(3); // 2  4  7  3
        System.out.println(st.isFull());  // true
        st.push(8);   //  Stack is full... You can't add 8  


		System.out.println(st.peek());  // 3
        st.pop();
        System.out.println(st.peek());  /// 7


		
		
		

	}

}
