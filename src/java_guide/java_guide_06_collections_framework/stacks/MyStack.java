/**
 * Stack implementation using Java Collections Framework.
 * * Stack:
 *          - LIFO (Last In First Out) data structure.
 *          - Allows duplicate elements.
 *          - Maintains insertion order.
 *          - Allows null elements.
 *          - Not synchronized.
 *          - Dynamic in size.
 *          - Common methods: push(), pop(), peek(), isEmpty(), search().
 * Usage:
 *          - Use Stack when you need LIFO behavior.
 *          - Suitable for scenarios like expression evaluation, backtracking algorithms, etc.
 *  Working:
 *          - Elements are added and removed from the top of the stack.
 *          - push() adds an element to the top.
 *          - pop() removes and returns the top element.
 *          - peek() returns the top element without removing it.
 *          - Example:
 *              Stack: [Bottom, ..., Top]
 *              push(10) -> [10]
 *              push(20) -> [10, 20]    
 *              pop()    -> returns 20, Stack: [10]
 *              peek()   -> returns 10, Stack: [10]
 * 
 */
package java_guide.java_guide_06_collections_framework.stacks;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);

        // traversing the Stack
        System.out.println("Traversing the stack:");
        for (Integer element : stack) {
            System.out.println(element);
        }

        // Peeking the top element
        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Popping elements from the Stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Checking if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Searching for an element
        int position = stack.search(10);
        System.out.println("Position of element 10 from top: " + position);
    }
    
}
