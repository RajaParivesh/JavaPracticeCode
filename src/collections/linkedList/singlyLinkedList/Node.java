package collections.linkedList.singlyLinkedList;

public class Node {
    private int data;
    public Node next;

    public Node(int n) {
        data = n;
        next=null;
    }

    public int value() {
        return data;
    }
}
