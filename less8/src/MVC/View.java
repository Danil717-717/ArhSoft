package MVC;

import java.util.List;

public class View {
    public void printStudent(Student student) {
        
        System.out.println(student.toString());
    }

    public void printStudents(List<Student> studentList) {
        System.out.println("---Список студентов---");
        for (Student student : studentList) {
            printStudent(student);
        }
    }
}
