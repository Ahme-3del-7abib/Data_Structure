/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Tree;

/**
 *
 * @author Simplx
 */
public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add('b');
        tree.add('g');
        tree.add('f');
        tree.add('d');
        tree.add('a');

        tree.printTree();
        System.out.println();

        System.out.println("--------------------------------");

        tree.delete('a');

        tree.printTree();
        System.out.println();
    }
}
