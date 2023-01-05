package StudentClass;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Student s1 = new Student(21,"Kishore");
        Student s2 = new Student(2,"Karthik");

        ArrayList<Student> student = new ArrayList<>();

        student.add(s1);
        student.add(s2);

        display(student);
    }

    private static void display(ArrayList<Student> student) {
        int j=1;

        Collections.sort(student , new Comparator <Student>() {
            @Override
            public int compare(Student s1 , Student s2){
            if(s1.id < s2.id) return -1;
            else if(s1.id > s2.id) return 1;
            else return 0;
            }
        });

        for (Student i:student) {
            System.out.println(j+". Id: "+ i.id + "     Name: "+ i.name);
            j++;
        }
    }
}

