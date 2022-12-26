package dataStructures.linkedList;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();

        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        }
        else {
            Node newNode = head;

            while (newNode.next != null){
                newNode = newNode.next;
            }
            newNode.next = node;
        }
    }

    public void printAll(){
        Node n = head;
        while (n.next != null){
            System.out.print(n.data+", ");
            n = n.next;
        }

        System.out.print(n.data);
    }



}