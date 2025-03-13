package com.acme.datastructures.chp3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Queue class interface is used to hold the elements about to be processed in
 * FIFO (First-in First out) order.
 *
 * Some implementations of Queue are:
 *  - LinkedList
 *  - ArrayBlockingQueue
 *  - PriorityQueue
 *
 * Java queue represents an ordered list of elements
 *
 */
public class QueueExample {

    static Function<String[], Queue<String>> queueFunction = array -> {
        Queue<String> q = new LinkedList<>();

        for(String s: array) {
            q.add(s);
        }

        return q;
    };

    public static void main(String... args) {

        String[] values = {"first", "second", "third", "fourth", "fifth"};

        Queue<String> queue = new LinkedList<>();
        Predicate<Queue<String>> queuePredicate = Queue::isEmpty;

        if(queuePredicate.test(queue)) {
            queue = queueFunction.apply(values);
        };

        System.out.println(queue);

        queue.add("other value");

        System.out.println(queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println(queue);
    }
}
