package MVP;

import java.util.List;

public class Model {
    public List<Student> getLocalStudents() {
        return Cache.listOfStudents();
    }

    public List<Student> getRemoteStudents() {
        return Cache.anotherListOfStudents();
    }
}
