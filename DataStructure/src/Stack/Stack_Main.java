/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Simplx
 */
public class Stack_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack_all_type stack = new Stack_all_type(4);

        stack.push("ahmed");
        stack.push("adel");
        stack.push("mohamed");
        stack.push("habib");
        

        System.out.println("reverse name : ");
        for (int i = 0; i < stack.size; i++) {

            System.out.print(stack.pop()+" ");
        }

    }

}
