import java.util.*;

public class Hashmap {

    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;


        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

        } 

        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private int HashFunc(K key){
            int hc = key.hashCode(); 
            return Math.abs(hc)%buckets.length;
        }

        public  void rehash(){
            LinkedList<Node>[] oldBucket = buckets;   
            initBuckets(oldBucket.length*2);
            n=0;
            for(var bucket : oldBucket)  {
                for(var node : bucket){
                    put(node.key , node.value);
                }
            }


        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size(){  
            return n; 
        }

        public int capacity(){
            return buckets.length;
        }

        public float load(){
            return (n*1.0f)/buckets.length; 
        }

        public void put(K key ,V value){ 
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
             int ei= searchInBucket(currBucket , key);
             if(ei == -1){
                Node node = new Node(key,value);  
                currBucket.add(node);
                n++;
             }else{
                Node currNode = currBucket.get(ei);  
                currNode.value = value;
             }

             if(n >= buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
             }
        }  

        public V get(K key ){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);  
            if(ei != -1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }

            return null;         

        }

        public V remove(K key ){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);  
            if(ei!=-1){  // key exit
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }else{      // key not exits
                return null;
            }

        }
        
    }

    public static void main(String[] args) {
        MyHashMap<String ,Integer> mp = new MyHashMap<>();
        System.out.println("Testing Out");
        mp.put("a",1);
        mp.put("b",3);
        mp.put("c",6);

        mp.put("d",90);
        System.out.println("Size  "+mp.size());
        mp.put("d",10); 
        System.out.println("Size  "+mp.size());

        System.out.println(mp.remove("d"));  // 10

        //testing get
        System.out.println(mp.get("a")); // 1
        System.out.println(mp.get("b"));  /// 3
        System.out.println(mp.get("c"));  // 6
        System.out.println(mp.get("f"));  // null


        System.out.println(mp.remove("c"));  //  6
        System.out.println(mp.remove("c"));  // null
        System.out.println("Size is "+mp.size());  //  2


        // Rehashing

        // mp.put("a",1);
        // mp.put("b",3);
        // System.out.println("Capacity : - "+mp.capacity());
        // System.out.println("load: = "+mp.load());
        

        // mp.put("d",61);
        // mp.put("e",61);
        // System.out.println("Capacity : - "+mp.capacity());
        // System.out.println("load: = "+mp.load());
        
        // System.out.println(mp.get("d"));
        


        
        
    }

    
    
}
