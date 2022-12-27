package dataStructures.Stack;

import java.util.Scanner;

public class Stack {
    static int top;
    static int size = 10;
    static int[] arr = new int[size];

    Stack() {
        top = -1;
    }

    public static boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack Empty");
            return true;
        }
        else
            return false;
    }

    public boolean isFull(){
        if(top < size)
            return false;
        else {
            System.out.println("Stack is Full");
            return false;
        }
    }

    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }
        return -1;
    }

    public void push(int a){
        if(!isFull())
            arr[++top] = a;

    }

    public int pop(){
        int ret = -1;
        if(!isEmpty()){
            ret = arr[top];
            arr[top--] = 0;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        Stack stack = new Stack();

        while(true){
            System.out.println("Enter your choice:");
            System.out.println("1. Push an Element into the stack.");
            System.out.println("2. Peek the top Element in the stack.");
            System.out.println("3. Delete the top Element in the stack.");
            System.out.println("4. Print all the elements of the stack.");
            System.out.println("Press any other key to terminate the program.");

            int choice = pk.nextInt();

            switch (choice){
                case 1:{
                    stack.push(pk.nextInt());
                    break;
                }

                case 2:{
                    stack.peek();
                    break;
                }

                case 3:{
                    stack.pop();
                    break;
                }

                case 4:{
                    stack.printAll();
                    break;
                }

                default:{
                    System.out.println("Program Terminated!");
                    return;
                }
            }

        }
    }

    public void printAll() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
