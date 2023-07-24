package domain;

/**
 * класс описания оценки фильма
 */
public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    /**
     * конструктор класса 
     * @param s - название фильма
     * @param v - оценка фильма
     * @param excellent - замечание 
     */
    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
}
