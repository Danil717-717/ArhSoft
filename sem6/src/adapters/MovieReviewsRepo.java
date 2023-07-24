package adapters;

import application.IFetchMovieReviews;
import domain.MovieReview;
import domain.MovieSearchRequest;

import java.util.*;

/**
 * класс адаптер, для показа отзывов
 * имплементирует интерфейс IFetchMovieReviews
 */
public class MovieReviewsRepo implements IFetchMovieReviews {
    
    /**
     * приватное поле Map для показа списка фильмов и обзоры
     */
    private Map<String, List<MovieReview>> movieReviewMap;

    /**
     * начало работы
     */
    public MovieReviewsRepo() {
        initialize();
    }
    
    /**
     * переопределенный метод интерфейса принемающий название фильма
     * возвращающий список обзоров
     */
    @Override
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    /**
     * стартовый метод создающий список 
     * и добавляет в него обзор-отзыв
     */
    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }


}