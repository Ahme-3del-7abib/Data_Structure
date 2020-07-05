/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Simplx
 */
public class Stack_all_type<T> {

    Object[] array;
    int size;
    int top;

    public Stack_all_type(int size) {

        this.size = size;
        array = new Object[size];
        top = -1;
    }

    public void push(T element) {

        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        array[top] = element;
    }

    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return (T) T;
        }
        T element =(T) array[top];
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
