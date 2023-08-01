package MVVM;

import java.util.List;

import MVC.Student;

public interface MutableLiveData<T> {

    void postValue(List<Student> list);

    void postValue(int listNumber);

}
