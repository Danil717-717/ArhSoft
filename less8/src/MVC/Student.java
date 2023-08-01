package MVC;

public class Student {

    private String name;
    private int age;
    private int id;

    

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Integer getId() {
        return null;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
    }

    

}
