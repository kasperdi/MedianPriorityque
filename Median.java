// Version: 2017100201
import java.io.*;
import java.util.*;

public class Median {
    // Add your private fields here
    private PriorityQueue<Integer> loHeap = new PriorityQueue<>(11, Collections.reverseOrder());
    private PriorityQueue<Integer> hiHeap = new PriorityQueue<>();

    public void add(int x) {
        loHeap.offer(x);
        if(loHeap.size() > hiHeap.size()){
            hiHeap.offer(loHeap.poll());
        }
        
        if ((hiHeap.size() != 0 && loHeap.size() != 0) && hiHeap.peek() < loHeap.peek()){
            hiHeap.offer(loHeap.poll());
            loHeap.offer(hiHeap.poll());
        }
    }
    
    public int median() {
        return hiHeap.peek();
    }
}
