import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
public class hashmap{
    public static void main(String[] args){
        // hash_map();
        solve();
    }
    public static void hash_map(){
        //basic functions of hashmap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",130);
        hm.put("Pak",50);
        hm.put("US",20);
        hm.put("UK",30);
        hm.put("Canada",10);

        // System.out.println(hm);

        hm.put("India",140);
        hm.put("Nigeria", 25);
        // System.out.println(hm);

        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("Eutopia")); 


        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Eutopia"));
        
        // Set<String>keys = hm.keySet();u
        // System.out.println(keys);
        for(String key : hm.keySet()){
            int val = hm.get(key);
            System.out.println(key+" "+val);
        }

    }


    

    public static void highestFrequecyOfCharacter(String str){
        HashMap<Character, Integer>hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(hm.containsKey(ch)){
                int oldfrequency = hm.get(ch);
                int newfrequency = oldfrequency+1;
                hm.put(ch,newfrequency);
            }else{
                hm.put(ch,1);
            }
        }
        char maxFrequencychar = str.charAt(0);
        for(Character key:hm.keySet()){
            if(hm.get(key) > hm.get(maxFrequencychar)){
                maxFrequencychar = key;
            }
        }

        System.out.println(maxFrequencychar);
        System.out.println(hm.get(maxFrequencychar)); 
    }

    public static void getCommonElement1(int[] arr1, int[] arr2){
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(hm.containsKey(arr1[i])){
                int of = hm.get(arr1[i]);
                int nf = of+1;
                hm.put(arr1[i],nf);
            }else{
                hm.put(arr1[i],1);
            }
        }
        
        for(int i=0;i<arr2.length;i++){
            if(hm.containsKey(arr2[i])){
                System.out.println(arr2[i]);
                hm.remove(arr2[i]);
            }
        }
    }

    public static void getCommonElement2(int[] arr1, int[] arr2){
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(hm.containsKey(arr1[i])){
                int of = hm.get(arr1[i]);
                int nf = of+1;
                hm.put(arr1[i],nf);
            }else{
                hm.put(arr1[i],1);
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(hm.containsKey(arr2[i]) && hm.get(arr2[i])>0){
                System.out.println(arr2[i]);
                int of = hm.get(arr2[i]);
                int nf = of-1;
                hm.put(arr2[i],nf);
            }
        }
        
    }

    public static void longestConsecutiveSequence(int[] arr){
        HashMap<Integer,Boolean> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],true);
        }

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i]-1)){
                hm.put(arr[i],false);
            }
        }

        int maxLength = 0;
        int maxStartingPoint = 0;

        for(int i=0;i<arr.length;i++){

            if(hm.get(arr[i])==true){
                int startingPoint = arr[i];
                int startingLength = 1;

                while(hm.containsKey(startingPoint+startingLength)){
                    startingLength++;
                }

                if(startingLength > maxLength){
                    maxStartingPoint = startingPoint;
                    maxLength = startingLength;
                }
            }
        }

        System.out.println(maxStartingPoint + " -> " + maxLength);
    }

    public static void hashmap_questions(){
        // String str = "babcccdbabcccd";
        // highestFrequecyOfCharacter(str);

        // int[] arr1 = {1,1,2,2,2,3,5};
        // int[] arr2 = {1,1,1,2,2,4,5};
        // getCommonElement1(arr1, arr2);
        // getCommonElement2(arr1, arr2);

        // int[] arr = {10,5,9,1,11,8,6,15,3,12,2};
        // longestConsecutiveSequence(arr);

    }

    //=============================== PRIORITY_QUEUE ============================================

    public static void priorityqueue_sort_ascending(int[] arr){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        

        for(int i=0;i<arr.length;i++){  //n
            pq.add(arr[i]); //log n
        }

        for(int i=0;i<arr.length;i++){  //n
            System.out.println(pq.peek());  //o(1)
            pq.remove(); //log n
        }
    }

    public static void priorityqueue_sort_descending(int[] arr){
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        

        for(int i=0;i<arr.length;i++){  //n
            pq.add(arr[i]); //log n
        }

        for(int i=0;i<arr.length;i++){  //n
            System.out.println(pq.peek());  //o(1)
            pq.remove(); //log n
        }
    }


    public static void kLargestElements(int k, int[] arr){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(i < k){
                pq.add(arr[i]);
            }else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while(pq.size() > 0){
            System.out.println(pq.remove());
        }
    }


    public static void priorityqueue_(){
        // int[] arr = {22,99,81,3,12,1};
        // priorityqueue_sort_ascending(arr);
        // priorityqueue_sort_descending(arr);
        
        // int[] arr = {2,10,5,17,7,18,6,4};
        // kLargestElements(3, arr);

    }

    public static void solve(){
        // hashmap_questions();
        priorityqueue_();
    }

}