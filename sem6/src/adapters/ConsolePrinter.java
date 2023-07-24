package adapters;

import application.IPrintMovieReviews;
import domain.MovieReview;

import java.util.List;

/**
 * класс адаптер для печати в консоль
 * имплементирует интерфейс  IPrintMovieReviews
 */
public class ConsolePrinter implements IPrintMovieReviews {
    
    /**
     * переопределенный метод интерфейса, печати в консоль
     */
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}