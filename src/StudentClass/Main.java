package StudentClass;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Student s1 = new Student(1,"Kishore");
        Student s2 = new Student(2,"Karthik");

        ArrayList<Student> student = new ArrayList<>();

        student.add(s1);
        student.add(s2);

        display(student);
    }

    private static void display(ArrayList<Student> student) {
        int j=1;
        for (Student i:student) {
            System.out.println(j+". Id: "+ i.id + "     Name: "+ i.name);
            j++;
        }
    }
}

