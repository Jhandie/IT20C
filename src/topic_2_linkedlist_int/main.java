package topic_2_linkedlist_int;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        //adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Current Linked List:");
        list.printList();

        //Delete
        System.out.println();
        System.out.println("Deleting 40 from the list...");
        System.out.println("Current Linked List:");
        list.deleteByValue(20);
        list.printList();

        //Move/Swap Pointer
        System.out.println();
        System.out.println("Movingn/Swapping node from index 1 to index 0");
        list.moveNodePointer(0, 1);
        list.printList();
    }
}