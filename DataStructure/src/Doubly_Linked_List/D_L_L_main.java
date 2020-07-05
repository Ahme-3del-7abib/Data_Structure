package Doubly_Linked_List;

public class D_L_L_main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add('a', 0);
        list.add('a', 1);
        list.add('a', 1);
        list.add('a', 3);
        list.add('a', 10);

        list.print();

        System.out.println("------------------");

    }
}
