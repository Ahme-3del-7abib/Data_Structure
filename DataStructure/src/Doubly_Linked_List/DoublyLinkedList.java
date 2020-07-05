package Doubly_Linked_List;

public class DoublyLinkedList {

    private Node head = null;

    public void print() {

        // start from head to null (first node to last node)
        Node i = head;
        while (i != null) {
            System.out.println(i.value);
            i = i.next;
        }
    }

    // add element to list
    public void add(char item, int index) {

        Node newNode = new Node();
        newNode.value = item;

        if (index == 0) {

            newNode.next = head;
            newNode.perivous = null;
            head = newNode;

        } else if (index > num_of_index()) {
            System.out.println("Index out of the box !!!");

        } else {

            Node periv = head;
            for (int i = 0; i < index - 1; i++) {
                periv = periv.next;
            }

            // problem is here
            newNode.next = periv.next;
            periv.perivous = newNode;

            periv.next = newNode;
            newNode.perivous = periv.next;

        }
    }

    // remove element from list
    public void remove(int index) {

        if (indexIsFound(index)) {

            if (index == 0) {
                head = head.next;

            } else {
                // get current
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }

                current.perivous = current.next;
            }
        } else {
            System.out.println("This element is not found ");
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
