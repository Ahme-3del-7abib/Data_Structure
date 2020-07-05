/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Simplx
 */
public class Stack_int {

    int[] array;
    int size;
    int top;

    public Stack_int(int size) {

        this.size = size;
        array = new int[size];
        top = -1;
    }

    public void push(int element) {

        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        array[top] = element;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        int element = array[top];
        top--;
        return element;

    }

    public boolean isFull() {
        if (top == array.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == - 1) {
            return true;
        }
        return false;
    }
}
