import java.util.ArrayList;
import java.util.LinkedList;
public class HashMapUser {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        int n;//no of nodes;
        int N;//no of buckets;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(K key, V value){
            this.N=4;
            this.buckets=new LinkedList[4];
            
            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<Node>();
            }
        }
        public int hashCode(K Key){
            int i = Key.hashCode();
            return Math.abs(i)%4;
        }
        public int searchInLinkedList(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        public void rehashing(){
            LinkedList<Node> oldBucket[]=buckets;
            this.N=N*2;
            buckets=new LinkedList[N];

            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++){
             LinkedList<Node> ll = oldBucket[i];
             for(int j=0;j<ll.size();j++){
                put(ll.get(j).key, ll.get(j).value);
             }
            }
        }
        public void put(K key, V value){
            int bucketIndex=hashCode(key);
            int dataIndex=searchInLinkedList(key,bucketIndex);

            if(dataIndex==-1){
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }else{
                Node data = buckets[bucketIndex].get(dataIndex);
                data.value=value;
            }

            double lambda=(double)n/N;

            if(lambda>2.0){
                rehashing();
            }
        }
        public boolean containsKey(K key) {
			int bi = hashCode(key);
			int di = searchInLinkedList(key, bi);

			if (di == -1) {
				return false;
			} else {
				return true;
			}

		}

		public V remove(K key) {
			
			int bi = hashCode(key);
			int di = searchInLinkedList(key, bi);

			if (di == -1) {
				return null;
			} else {
				Node node = buckets[bi].remove(di);
				n--;
				return node.value ;
			}

		}

		public V get(K key) {
			int bi = hashCode(key);
			int di = searchInLinkedList(key, bi);

			if (di == -1) {
				return null;
			} else {
				Node node = buckets[bi].get(di);
				return node.value ;
			}
		}
		public ArrayList<K> keySet() {
			ArrayList<K> arrayList= new ArrayList<>();
			
			for(int i=0;i<buckets.length;i++) {
				LinkedList<Node> ll = buckets[i];
				for(int j=0;j<ll.size();j++) {
					arrayList.add(ll.get(j).key);
				}
			}
			return arrayList;
			
			}
		public boolean isEmpty() {
			return n==0;
			}
        public static void main(String[] args) {
            HashMap<Integer,String> map = new HashMap<Integer,String>(null, null);
            map.put(1, "A");
            map.put(2, "B");
            map.put(3, "C");
            map.put(4, "D");
            map.put(5, "E");
            map.put(6, "F");
            map.put(7, "G");
            map.put(8, "H");
            map.put(9, "I");

            ArrayList<Integer> keys = map.keySet();

			for(int i=0; i<keys.size(); i++) {
			System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
			}
        }
    }
    
}
