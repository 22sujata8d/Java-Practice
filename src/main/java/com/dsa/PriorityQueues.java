package com.dsa;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // add() - inserts the specified element and if the queue is full, it throws an exception.
        pq.add(2);
        pq.add(10);
        pq.add(8);
        System.out.println(pq);

        // offer() - inserts the specified element and if the queue is full, it returns false.
        pq.offer(1);
        System.out.println(pq);
        System.out.println(pq.peek());

        // remove() - removes the specified element from the queue.
        pq.remove(2);
        System.out.println(pq);

        // poll() - returns and remove the head of the queue.
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.size());
        System.out.println(pq.contains(8));
        System.out.println(pq.contains(11));

        // toArray() - converts a priority queue to an array and return it.
        Object[] arr = pq.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " , ");
        }

        System.out.println();

        // using customer comparator
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomerComparator());
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(3);

        System.out.println(numbers);
    }
}

class CustomerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int value = o1.compareTo(o2);

        // elements are sorted in reverse order
        return Integer.compare(0, value);
    }
}

