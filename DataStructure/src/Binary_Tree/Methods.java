package Binary_Tree;

public class Methods {

    public static int Length(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(Length(node.left), Length(node.right));
        }
    }

    // Insertion ...
    public static void addNode(Node newNode, Node currentNode) {

        if (currentNode == null) {
            BinaryTree.root = newNode;
            return;
        }

        if (newNode.value == currentNode.value) {
            System.out.println("Element already exist");
            return;
        }

        if (newNode.value > currentNode.value) {

            // current node it`s right next is null
            if (currentNode.right == null) {
                currentNode.right = newNode;
                return;
            }

            // add to right of current
            addNode(newNode, currentNode.right);

        }
        if (newNode.value < currentNode.value) {

            // current node it`s right next is null
            if (currentNode.left == null) {
                currentNode.left = newNode;
                return;
            }
            // add to right of current
            addNode(newNode, currentNode.left);
        }

    }

    /*
    
     Delet progress
        
     */
    public static Node deleteNode(Node currentNode, char value) {

        if (currentNode == null) {
            return null;
        }

        // if you found value
        if (value == currentNode.value) {

            // 1 - first case -  Node has no chidreen
            if (currentNode.left == null && currentNode.right == null) {
                currentNode = null;
                return currentNode;
            }

            // 2 - Second case - Node has one child
            if (currentNode.right == null) {

                // put parent == it`s left child 
                currentNode = currentNode.left;
                return currentNode;
            }

            if (currentNode.left == null) {

                // put parent == it`s right child 
                currentNode = currentNode.right;
                return currentNode;
            }

            // Third case - Node has two child
            char small_item_in_right = getSmallValueFromRight(currentNode.right);
            currentNode.value = small_item_in_right;
            currentNode.right = deleteNode(currentNode.right, small_item_in_right);

        }

        if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
            return currentNode;
        }
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
            return currentNode;
        }

        return currentNode;
    }

    public static char getSmallValueFromRight(Node root) {

        // امتي تقف ؟
        // انت اول حاجه بتخش يمين 
        // بعد كدا بتخش علي كل الشمالات تاخذ اصغر واحد فيهم 
        // اقف بقي لما توصل لعنصر ملهوش شمال 
        if (root.left == null) {
            return root.value;
        }
        return getSmallValueFromRight(root.left);
    }

    /* 
        
     End delete
            
     */
    // Seaching ..
    public static void isFound(Node current, char value) {

        if (current == null) {

            System.out.println("Element not found");
            return;
        }

        if (current.value == value) {
            System.out.println("Element Is found ");
            return;

        }
        if (value > current.value) {

            isFound(current.right, value);

        }

        if (value < current.value) {

            isFound(current.left, value);

        }
    }

    /*
     Traversing
     1 -- pre order
     2 -- post order
     3 -- In order
    
     */
    public static void printPreOrder(Node root) {

        // print my self root 
        System.out.println(root.value);

        // print left sub tree
        if (root.left != null) {
            printPreOrder(root.left);
        }

        // print right sub tree
        if (root.right != null) {
            printPreOrder(root.right);
        }
    }
    
    public static void printInOrder(Node root) {

        // print left sub tree
        if (root.left != null) {
            printInOrder(root.left);
        }

        // print my self root 
        System.out.print(root.value + "    ");

        // print right sub tree
        if (root.right != null) {
            printInOrder(root.right);
        }
    }
    
    public static void printPostOrder(Node root) {

        // print left sub tree
        if (root.left != null) {
            printPostOrder(root.left);
        }

        // print right sub tree
        if (root.right != null) {
            printPostOrder(root.right);
        }

        // print my self root 
        System.out.print(root.value + "    ");
    }

    /* 
    
     End Traversing
    
     */
    // get parent of given value
    public static Node getParent(Node node, char val, char parent) {

        if (node == null) {

            return null;
        }

        Node n = null;
        // If current node is the required node 
        if (val == node.value) {

            // Print its parent 
            System.out.print(parent);
        } else {

            if (val > node.value) {
                n = getParent(node.right, val, node.value);
            }
            if (val < node.value) {
                n = getParent(node.left, val, node.value);
            }
        }
        return n;
    }

}
