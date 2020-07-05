package Binary_Tree;

public class BinaryTree {

    public static Node root = null;

    public boolean isEmpty() {
        return root == null;
    }

    public int getlength() {
        return Methods.Length(root);
    }

    // print all elements using pre order  traverse
    public void printTree() {
        if (!isEmpty()) {
            Methods.printPostOrder(root);
            return;
        }
        System.out.println("tree is empty");
    }

    public void add(char value) {
        Node newNode = new Node();
        newNode.value = value;
        Methods.addNode(newNode, root);
    }

    public void delete(char value) {
        root = Methods.deleteNode(root, value);
    }

    public void Search(char value) {
        Methods.isFound(root, value);
    }

    public void findParent(char value) {
        Methods.getParent(root, value, root.value);
    }
}
