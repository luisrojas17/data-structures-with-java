package com.acme.datastructures.chp3;

import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * The Stack class is based on the basic principle of LIFO last-in-first-out.
 */
public class StackExample {

    static void fillStack() {

    }

    public static void main(String... args) {

        Stack<Integer> stackOfNumbers = new Stack<>();
        stackOfNumbers.push(1);
        stackOfNumbers.push(2);
        stackOfNumbers.push(3);
        stackOfNumbers.push(4);

        Predicate<Stack<Integer>> isEmptyPredicate = Stack::empty;
        while (isEmptyPredicate.test(stackOfNumbers)) {
            System.out.println();
        }

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 78, 8, 9};
        Consumer<Integer[]> fillStack = array -> {

            for (Integer item : array) {
                stackOfNumbers.push(item);
            }

        };

        fillStack.accept(numbers);

        System.out.println("The first item in stack is " + stackOfNumbers.peek() + " and its index is: " + stackOfNumbers.search(stackOfNumbers.peek()));
        System.out.println("The size of stack is: " + stackOfNumbers.size());
    }
}
