import java.util.LinkedList;
public class implementHashmap{
    public static void main(String[] args){

    }
    public static class HashMap<K,V>{
        public class HMNode{
            K key;
            V val;

            HashMap(K key,V val){
                this.key = key;
                this.val = val;
            }
        }

        int size;
        LinkedList<HMNode>[] buckets;

        public HashMap(){
            intitbucket(4);
            size = 0;
        }
        private void intitbucket(int N){
            buckets = new LinkedList[N];
        }

        public void put(K key, V val){

        }

        public void get(k key){
            
        }

        public void remove(K key){
            
        }

        public void containsKey(K key){
            
        }

        public void size(){
            
        }
    }
}