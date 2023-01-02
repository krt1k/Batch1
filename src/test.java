import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class test {
    static int z =0;

    static Node head,tail; //by default initialized to null

    public static void add(int data)
    {
        Node temp = new Node(data);
        temp.next = null;

        if(head == null)
            head = tail = temp;
        else
        {
            tail.next = temp;
            tail = temp;
        }
    }

    public static void insert(int value,int position)
    {
        Node temp = new Node(value);
        temp.next = null;

        if(position == 1)
        {
            temp.next = head;
            head = temp;
        }
        else
        {
            Node curr = head;
            for(int i=1;i<position-1;i++)
            {
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public static void delete(int val)
    {
        Node curr = head;
        Node prev = null;

        if(curr != null && curr.data == val)
        {
            head = curr.next;
            return;
        }

        while(curr != null && curr.data != val)
        {
            prev = curr;
            curr = curr.next;
        }

        if(curr == null)
        {
            System.out.println("Not in list");
            z = 1;
            return;
        }

        prev.next = curr.next;
    }


    // Method to print the LinkedList.
    public static void display()
    {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int val;
        test list = new test();

        add(10);
        add(20);
        add(30);
        add(40);
        add(50);

        val = sc.nextInt();
        delete(val);

        if (z==0)
            display();
    }
}