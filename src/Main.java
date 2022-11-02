import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student marcell = new Student("Marcell", 30);

        students.add(marcell);

        Student vladimir = new Student();
        vladimir.name = "Vladimir";
        vladimir.age = 28;

        marcell.print();
        vladimir.print();

        students.add(vladimir);

        for (Student student : students) {
            student.print();
        }
    }
}
