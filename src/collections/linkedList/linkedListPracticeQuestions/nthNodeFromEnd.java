package collections.linkedList.linkedListPracticeQuestions;


import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.Hashtable;

public class nthNodeFromEnd extends SinglyLinkedList {

    public nthNodeFromEnd() {
        super();
    }


    public Node nthFromLastMethod1(int positionFromEnd) {
        // this code is not working for positionFromEnd = 1
//    public void nthFromLastMethod1(int positionFromEnd) {
        int positionFromStart = 0;
        if (positionFromEnd <= 0) {
            System.out.println("Zeorth and Negative position is not possible");
            return null;
        }
        if (positionFromEnd <= super.size()) {
            positionFromStart = super.size() - positionFromEnd + 1;
        } else {
            System.out.println("Invalid position");
            return null;
        }
//        System.out.println(super.get(positionFromStart));
        System.out.println("Node " + positionFromEnd + " from last is: " + super.get(positionFromStart).value());
        return super.get(positionFromStart);
    }


    // nth node form end using hash table

    /**
     * @param positionFromEnd
     * @return
     */
    // Not working for 1
    public Node nthFromLastMethod2(int positionFromEnd) {
        Node head = super.get(1);
        int i = 1;

        Hashtable<Integer, Node> hashTable = new Hashtable<>();
        hashTable.put(i, head);
        while (head.next != null) {
            head = head.next;
            i++;
            hashTable.put(i, head);
        }

        return hashTable.get(super.size() - positionFromEnd + 1);
    }

    /**
     * nth node from end using two pointers in one scan in linked list
     * @param positionFromEnd
     * @return
     */
    public Node nthFromLastMethod3(int positionFromEnd) {
        int temp = positionFromEnd;
        Node head = super.get(1);
        Node tail = super.get(1);


        while (temp != 1) {
            head = head.next;
            temp--;
        }

        while (head.next != null) {
            head = head.next;
            tail = tail.next;
        }
        return tail;
    }

    /**  Not Working
     * find nth node from end using recursion
     * @param positionFromEnd
     * @return
     */
//    int counter =0;
//    Node head = super.get(1);
//    public Node nthFromLastMethod4(Node head, int positionFromEnd) {
//
//        //Recursive case
//        if(head != null){
//            nthFromLastMethod4(head.next, positionFromEnd);
//            counter++;
//            //Base case
//            if(positionFromEnd == counter){
//                return head;
//            }
//        }
//        return null;
//    }
}