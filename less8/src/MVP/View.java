package MVP;

import java.util.List;

import MVC.Student;

public class View {
    private final Presenter presenter;

    public View(Presenter presenter) {
        this.presenter = presenter;
    }


    public void showStudents(List<Student> students) {
        students.forEach(System.out::println);
    }

    public void showSeparator() {
        System.out.println("----");
    }
}
