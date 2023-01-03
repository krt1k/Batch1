package dataStructures.llSelf;

public class ll {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        int data;
        Node next;

        public Node(){
            this.next = null;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ll(){
        size = 0;
    }

    public void insertFirst(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;

        if(tail == null)
            tail = head;

        size++;
    }

    public void insertLast(int data){
        if (tail == null){
            insertFirst(data);
            return;
        }

        Node n = new Node(data);
        tail.next = n;
        tail = n;

        size++;
    }

    public void insertAt(int data, int pos){
        if (pos == 0)
            insertFirst(data);
        else if (pos == size-1) {
            insertLast(data);
        }
        else {
            Node n = new Node(data);

            Node pointer = head;

            for (int i = 0; i < pos - 1; i++)
                pointer = pointer.next;

            n.next = pointer.next;
            pointer.next = n;
            size++;
        }
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;

        if(head == null)
            tail = null;

        size--;
        return val;
    }

    public int deleteLast() {
        int val = tail.data;

        Node pointer = head;
        Node temp = new Node();

        while(pointer.next != null){
            temp = pointer;
            pointer = pointer.next;
        }

        temp.next = null;
        size--;
        return val;
    }

    public void printAll(){
        Node newNode = head;

        do{
            System.out.print(newNode.data+" ");
            newNode = newNode.next;
        }while(newNode.next != null);
        System.out.print(newNode.data);

    }

}
