/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Simplx
 */
public class Queue_int {

    int[] array;
    int size;
    int first;
    int last;

    public Queue_int(int size) {

        this.size = size;
        array = new int[size];
        first = -1;
        last = -1;
    }

    public boolean isFull() {
        if (last == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (first == last) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            last++;
            array[last] = item;
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        } else {
            first++;
            int item = array[first];

            if (first == size - 1 && last == size - 1) {

                first = -1;
                last = -1;
            }

            return item;
        }

    }

}
