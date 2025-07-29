package Data_Structures_Algorithms.Heaps;

import java.util.*;

public class Heap {

    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(100);
        pq.add(101);
        pq.add(102);
        pq.add(199);
        pq.add(1);
        pq.add(10);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }

}
