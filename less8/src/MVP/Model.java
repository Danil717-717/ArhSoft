package MVP;

import java.util.List;

import MVC.Student;

public class Model {

    public Model(List<Student> students) {
    }

    public List<Student> getLocalStudents() {
        return Cache.listOfStudents();
    }

    public List<Student> getRemoteStudents() {
        return Cache.anotherListOfStudents();
    }
}
