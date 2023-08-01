package MVC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Model {
    private final HashMap<Integer, Student> cache = new HashMap<>();
    private List<Student> students;


    public Model(List<Student> students) {
        this.students = students;
    }

    public void insertCache(List<Student> studentList) {
        for (Student student : studentList) {
            cache.put(student.getId(), student);
        }
    }

    public void insertStudent(Student student) {
        cache.put(student.getId(), student);
    }

    public void updateCache(List<Student> studentList) {
        cache.clear();
        insertCache(studentList);
    }

    public void updateStudentById(int id, Student student) {
        cache.replace(id, student);
    }

    public List<Student> getAllStudents() {
        //return new ArrayList<>(cache.values());
        return students;
    }
}
