import java.util.Collections;
import java.util.PriorityQueue;

public class priority_intro {
    public static void main(String[] args)throws Exception{
        
        int[] arr= {2,6,3,9,10,4};
        PriorityQueue<Integer> pq = new PriorityQueue<>();// Default min heap
        for(int ele: arr){
            pq.add(ele);
        }

        while(pq.size()!=0){
            System.out.println(pq.peek());
            pq.remove();
        }
//This print elements in ascending order

PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());// Max heap
        for(int ele: arr){
            pq1.add(ele);
        }

        while(pq1.size()!=0){
            System.out.println(pq1.peek());
            pq1.remove();
        }
//This print elements in descending order
    }
}
