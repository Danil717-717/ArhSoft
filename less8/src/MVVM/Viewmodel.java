package MVVM;

import java.util.List;

import MVC.Student;

public class Viewmodel {
    private final Model model = new Model();
    private final MutableLiveData<List<Student>> students = new MutableLiveData<>();
    private final MutableLiveData<Integer> studentsListNumber = new MutableLiveData<>(model.getListNumber());

    public LiveData<List<Student>> studentsLiveData() {
        return students;
    }

    public LiveData<Integer> listNumberLiveData() {
        return studentsListNumber;
    }

    public void updateData() {
        model.updateListNumber();
        studentsListNumber.postValue(model.getListNumber());
        students.postValue(model.getData());
    }
}
