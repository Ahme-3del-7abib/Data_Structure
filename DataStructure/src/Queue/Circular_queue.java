package Queue;

public class Circular_queue<T> {

    Object[] array;
    int size;
    int first;
    int last;

    public Circular_queue(int size) {

        this.size = size;
        array = new Object[size];
        first = -1;
        last = -1;
    }

    public boolean isFull() {
        if ((first == -1 && last == size - 1) || (first == last) && first != -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (first == last && first == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {

            if (last == size - 1) {
                last = 0;
            } else {
                last++;
            }

            array[last] = item;
        }
    }

    public T deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {

            if (first == size - 1) {
                first = 0;
            } else {
                first++;
            }

            T item = (T) array[first];

            if (first == last) {
                first = -1;
                last = -1;
            }
            return item;
        }
    }

}
