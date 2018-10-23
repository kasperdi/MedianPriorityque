// Version: 2017100201
import java.io.*;
import java.util.*;

public class Median {
    // Add your private fields here
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, Collections.reverseOrder());
    private int median;
    public void add(int x) {
        minHeap.offer(x);
        
        while(minHeap.size() > maxHeap.size())
        {
            maxHeap.offer(minHeap.poll());
        }
    }

    public int median() {
        
        
        
        return minHeap.peek();
    }
}
