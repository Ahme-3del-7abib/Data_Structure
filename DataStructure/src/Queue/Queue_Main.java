/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Simplx
 */
public class Queue_Main {

    public static void main(String[] args) {

        /* simple queue */
        /*
         Queue_int queue = new Queue_int(3);

         queue.enQueue(1);
         queue.enQueue(5);
         queue.enQueue(6);
         //queue.enQueue(7);

         for (int i = 0; i < queue.size; i++) {

         System.out.print(queue.deQueue()+" ");
         }

         System.out.println();
         queue.enQueue(1);
         System.out.println(queue.deQueue());
         */
        //
        /* Circular queue */
        
        Circular_queue circular_queue = new Circular_queue(4);
        
        circular_queue.enQueue(5);
        circular_queue.enQueue(8);
        circular_queue.enQueue(9);
        circular_queue.enQueue(10);
        //circular_queue.enQueue(5);  // queue is full
        
        circular_queue.deQueue();
        circular_queue.deQueue();
        circular_queue.deQueue();
        
        
        circular_queue.enQueue(20);
        circular_queue.enQueue(50);
        circular_queue.enQueue(60);
        //circular_queue.enQueue(70); queue is full
        
        while (!circular_queue.isEmpty()) {            
            System.out.println(circular_queue.deQueue());
        }
        
    }

}
