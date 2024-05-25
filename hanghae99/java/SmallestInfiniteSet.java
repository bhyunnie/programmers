package hanghae99.java;

import java.util.PriorityQueue;

public class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    int i = 1;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (pq.isEmpty()) {
            return i++;
        } else {
            return pq.poll();
        }
    }

    public void addBack(int num) {
        if (num < i && !pq.contains(num)) {
            pq.add(num);
        }
    }
}
