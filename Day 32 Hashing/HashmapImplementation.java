import java.util.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
public class HashmapImplementation {
    static class HashMap<K,V> {//Generic
        private class Node{
            K Key;
            V Value;

            public Node(K Key,V Value){
                this.Key = Key;
                this.Value = Value;
            }
        }
        private int n; // n = Nodes
        private int N ;
        private LinkedList<Node> buckets[]; //N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K Key){
        int hc = Key.hashCode();
         return  Math.abs(hc)%N;
        }

        private int SearchInLL(K Key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.Key ==Key){
                    return di;
                }
                di++;

            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
            //nodes-> add in bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.Key,node.Value);
                }
            }
        }
        public void put(K Key , V Value){
            int bi = hashFunction(Key); // 0 - size-1;
            int di = SearchInLL(Key,bi);// Valid / -1;
            
            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.Value = Value;
            }else{
                buckets[bi].add(new Node(Key, Value));
                n++;
            }
            double lambda = (double)n/N;
            if(lambda >2.0){
                rehash();
            }
        }
        public boolean containsKey(K Key){
              int bi = hashFunction(Key); // 0 - size-1;
            int di = SearchInLL(Key,bi);// Valid / -1;
            
            if(di!=-1){
              return true;
            }else{
             return false;
            }
        }
        public V get(K Key){
          int bi = hashFunction(Key); // 0 - size-1;
            int di = SearchInLL(Key,bi);// Valid / -1;
            
            if(di!=-1){
                Node node = buckets[bi].get(di);
               return node.Value;
            }else{
               return null;
            }
        }
        public V remove(K Key){
            int bi = hashFunction(Key);
         int di = SearchInLL(Key,bi);// Valid / -1;
            
            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
               return node.Value;
            }else{
               return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node: ll){
                    keys.add(node.Key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String args[]){
    HashMap<String,Integer> hm = new HashMap<>();
    hm.put("India", 100);
    ArrayList<String>keys = hm.keySet();
    for(String key:keys){
        System.out.println(key);
    }
    System.out.println(hm.get("India"));
    }
}
