package dataStructures.llSelf;

public class Main {
    public static void main(String[] args) {
        ll e = new ll();

        System.out.println("Inserting at first:");
        e.insertLast(99);
        e.insertFirst(4);
        e.insertFirst(3);

        e.printAll();
        System.out.println();

        System.out.println("Inserting at last:");
        e.insertFirst(5);
        e.insertLast(98);
        e.insertLast(97);

        e.printAll();
        System.out.println();

        System.out.println("Inserting at index 3:");
        e.insertAt(90,3);

        e.printAll();
        System.out.println();

        System.out.println("Deleting at first:");
        System.out.println(e.deleteFirst());

        e.printAll();
        System.out.println();

        System.out.println("Deleting at last:");
        System.out.println(e.deleteLast());

        e.printAll();
        System.out.println();

        e.reverse();
        e.printAll();
        System.out.println();
    }
}
