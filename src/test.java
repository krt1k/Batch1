import java.util.Scanner;

public class test{
    private Node head;
    private Node tail;
    private int size;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public test(){
        size = 0;
    }

    public void add(int data){
        Node n = new Node(data);

        if(head == null)
            head = n;
        else{
            Node newnode = head;

            while(newnode.next != null){
                newnode = newnode.next;
            }

            newnode.next = n;
        }

    }

    public void printAtest(){
        Node n = head;

        while(n.next!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.print(n.data);

    }

    public static void main(String[] args){
        Scanner pk = new Scanner(System.in);
        test e = new test();

        int a = pk.nextInt();

        for(int i=0; i<a; i++)
            e.add(pk.nextInt());

        e.printAtest();
    }



}