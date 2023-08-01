package MVVM;

import java.util.List;

import MVC.Student;
import MVP.Cache;

public class Model {
    private int listNumber = -1;

    public int getListNumber() {
        return listNumber;
    }

    public List<Student> getData() {
        return listNumber != 1 ? Cache.listOfStudents() : Cache.anotherListOfStudents();
    }

    public void updateListNumber() {
        listNumber = listNumber != 0 ? 0 : 1;
    }
}
