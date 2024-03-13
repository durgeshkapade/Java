public class CircularQueueArray {
    public static class cqa{
        int front = -1;
        int rear  = -1;
        int size = 0;
        int arr[] = new int[5];

        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full ");

            }else if(size==0){
                front=rear=0;
                arr[0] = val;
            }else if(rear<arr.length-1){  //normal case
                arr[++rear]=val;
            }else if(rear==arr.length-1){
                rear=0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty ");
            }else {
                int ans = arr[front];
                if(front<=rear) front++;
                if(front==arr.length-1) front=0;
                size--;
                return ans;
            }
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty ");
            }else{
                return arr[front];
            }
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        public void Display() {
            if(size==0){
                System.out.println("Queue is Empty ");
            }else if(front<=rear){
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for (int i = front; i <arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }

            System.out.println();
            
        }


    }


    public static void main(String[] args) throws Exception {
        
        cqa q = new cqa();
        q.Display();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4); // 1 2 3 4

        q.Display();
        q.add(5); // 1 2 3 4 5
        q.Display();

        q.remove();  // 2 3 4 5
        q.Display();
        q.add(6); // 2 3 4 5 6  == but in real 6 2 3 4 5
        q.Display();

        System.out.println(q.size);
        q.add(8);
        


// how they actullay work
        for (int i = 0; i < q.arr.length; i++) {
            //System.out.print(q.arr[i]+" ");
        }

    }
}
