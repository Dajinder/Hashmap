import java.util.ArrayList;
public class heap{
    public static void main(String[] args){
        priorityQueue pq = new priorityQueue();

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(5);
        pq.add(2);
        pq.add(43);
        pq.add(55);
        pq.add(1);

        System.out.println(pq.peek());
        System.out.println(pq.size());
        
        System.out.println(pq.remove());
        System.out.println(pq.size());

        System.out.println(pq.remove());
        System.out.println(pq.peek());
        
        
    }

    //========== Implementation of Priority Queue USing Heap ==============

    public static class priorityQueue{

        ArrayList<Integer> data = new ArrayList<>();

        public void add(int val){
            data.add(val);
            upheapify(data.size()-1);
        }

        public void upheapify(int ci){
            if(ci==0){
                return ;
            }

            int pi = (ci-1)/2;

            if(data.get(ci)<data.get(pi)){
                swap(ci,pi);
                upheapify(pi);
            }
        }

        public void swap(int i, int j){
            int ith = data.get(i);
            int jth = data.get(j);
            data.set(i,jth);
            data.set(j,ith);
        }

        public int remove(){
            if(this.size()==0){
                System.out.print("Underflow");
                return -1;
            }
            // int root = data.get(0);
            swap(0,data.size()-1);
            int val = data.remove(data.size()-1); 
            downheapify(0);
            return val;
        }

        public void downheapify(int pi){
            
            int min = pi;
            
            int lci = 2*pi+1;
            if(lci<data.size() && data.get(lci)<data.get(min)){
                min = lci;               
            }

            int rci = 2*pi+2;
            if(rci<data.size() && data.get(rci)<data.get(min)){
                min = rci;                
            }

            if(min!=pi){
                swap(pi,min);
                downheapify(min);     
            }


        }

        public int peek(){
            if(this.size() ==0){
                System.out.println("Underflow");
                return -1;
            }else{
                return data.get(0);
            }
        }

        public int size(){
            return data.size();
        }
    }
}