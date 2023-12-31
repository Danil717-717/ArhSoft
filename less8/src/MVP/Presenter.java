package MVP;

public class Presenter {
    private View viewContract;
    private final Model model;

    public Presenter(Model model) {
        this.model = model;
    }

    public void attachView(View viewContract) {
        this.viewContract = viewContract;
    }

    public void loadStudents() {
        viewContract.showStudents(model.getRemoteStudents());
        viewContract.showSeparator();
    }

    public void getLocalStudents() {
        viewContract.showStudents(model.getLocalStudents());
        viewContract.showSeparator();
    }
}
