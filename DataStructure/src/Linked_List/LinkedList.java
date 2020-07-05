package Linked_List;

public class LinkedList {

    private Node head = null;

    // print all list
    public void print() {

        // start from head to null (first node to last node)
        Node i = head;
        while (i != null) {
            System.out.println(i.value);
            i = i.next;
        }
    }

    // add element in list
    public void add(char item, int index) {

        Node newNode = new Node();
        newNode.value = item;
        
        if (index == 0) {

            newNode.next = head;
            head = newNode;

        } else if (index > num_of_index()) {
            System.out.println("Index out of the box !!");
        } else {

            Node perivous = head;
            for (int i = 0; i < index - 1; i++) {
                perivous = perivous.next;
            }
            newNode.next = perivous.next;
            perivous.next = newNode;

        }
    }

    // remove element from list
    public void remove(int index) {

        if (indexIsFound(index)) {
            if (index == 0) {
                head = head.next;
            } else {
                Node perivous = head;
                for (int i = 0; i < index - 1; i++) {
                    perivous = perivous.next;
                }

                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }

                perivous.next = current.next;
            }
        } else {
            System.out.println("this index not found !! ");
        }
    }

    public boolean indexIsFound(int index) {

        Node i = head;
        int curent_index = 0;

        while (i != null) {
            if (index == curent_index) {
                return true;
            } else {
                i = i.next;
                curent_index++;
            }
        }
        return false;
    }

    public int num_of_index() {

        Node i = head;
        int curent_index = 0;

        while (i != null) {
            i = i.next;
            curent_index++;
        }
        return curent_index;

    }
}
