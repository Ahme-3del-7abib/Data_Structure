package Linked_List;

public class Liked_list_main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add('a', 0);
        linkedList.add('a', 1);
        linkedList.add('a', 1);
        linkedList.add('a', 1);
        linkedList.add('a', 10);

        //System.out.println(linkedList.lastIndex());
        linkedList.print();
        System.out.println(linkedList.num_of_index());
    }
}
