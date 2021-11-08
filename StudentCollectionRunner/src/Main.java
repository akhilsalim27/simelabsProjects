import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        List<Student>students=List.of(new Student(100,"Ebin"),new Student(1,"Anand"),
                new Student(5,"Harish"),new Student(60,"Mishal") );

        List<Student>studentsAl=new ArrayList<>(students);

        System.out.println(students);

        Collections.sort(studentsAl);

        System.out.println(studentsAl);
    }
}
