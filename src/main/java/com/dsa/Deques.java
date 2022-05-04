package com.dsa;

import java.util.Deque;
import java.util.LinkedList;

public class Deques {
    public static void main(String[] args) {
        Deque<Person> deque = new LinkedList<>();
        deque.add(new Person("Alex"));
        deque.add(new Person("Merlin"));
        deque.add(new Person("Clara"));
        deque.addFirst(new Person("Robert"));
        deque.addLast(new Person("Will"));

        System.out.println(deque);
        System.out.println(deque.size());

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }

    record Person(String name){}
}
