package application;

import domain.MovieReview;
import domain.MovieSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * класс с логикой приложения
 */
public class MovieApp implements Consumer<MovieSearchRequest> {
    /**
     * поля обьекты интерфейсов
     */
    private IFetchMovieReviews fetchMovieReviews;
    private IPrintMovieReviews printMovieReviews;
    /**
     * рандом
     */
    private static Random rand = new Random();

    /**
     * конструктор класса принемающий обьекты интерфесов
     * @param fetchMovieReviews
     * @param printMovieReviews
     */
    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    /**
     * метод принемает список фильмов
     * @param movieReviewList - список искомых фильмов
     * @return - возврат рандомный отзывов
     */
    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }

    /**
     * метод выбора рандомного элемента
     * @param size - размер списка
     * @return  - рандомный элемент
     */
    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    /**
     * метод выполнения запуска логики
     */
    public void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList));
        printMovieReviews.writeMovieReviews(randomReviews);
    }
}
