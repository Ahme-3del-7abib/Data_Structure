/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Arrays;
import java.util.Scanner;

public class Exp_evaluation_version1 {

    /* 
     Expression evaluation without (  )  أقواس
     */
    public static void main(String[] args) {

        Stack_character stack = new Stack_character(10);
        //Stack_character stack2 = new Stack_character(10);

        Scanner input = new Scanner(System.in);
        String infix;

        System.out.println("Enter your infix : ");
        infix = input.nextLine().trim();

        System.out.println("-----------------------------------");
        System.out.println("Infix = " + infix);

        char[] array = infix.toCharArray();
        char[] newArray = new char[array.length];
        //char[] operator_array = new char[10];

        for (int i = 0; i < array.length; i++) {

            if (array[i] != '+' && array[i] != '-' && array[i] != '*' && array[i] != '/'
                    && array[i] != '%' && array[i] != '(' && array[i] != ')') {
                // أول حاجة حطة علي جنب وليكن في أراي جديد
                newArray[i] = array[i];
            } else {

                while (!stack.isEmpty() && !isLarePeriority(stack.array[stack.top], array[i])) {
                    newArray[i] = stack.array[stack.top];
                    stack.pop();
                }

                stack.push(array[i]);
            }
        }

        String x = String.copyValueOf(newArray);
        StringBuilder PostFix = new StringBuilder(x);

        while (!stack.isEmpty()) {

            // append it to newArray
            char top_stack = stack.array[stack.top];
            PostFix.append(top_stack);
            stack.pop();
        }

        System.out.println("Postfix = " + PostFix);

    }

    public static int rating_operator(char operator) {

        int degree = 0;

        if (operator == ')' || operator == '(') {
            degree = 100;
        } else if (operator == '*' || operator == '/' || operator == '%') {

            degree = 90;
        } else if (operator == '+' || operator == '-') {

            degree = 80;
        }

        return degree;
    }

    public static boolean isLarePeriority(char top, char com) {

        int operator_degree = rating_operator(com);
        int last_operator_degree = rating_operator(top);

        if (operator_degree > last_operator_degree) {
            return true;
        }

        return false;
    }

}
