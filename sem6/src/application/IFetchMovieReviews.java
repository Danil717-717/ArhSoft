package application;

import java.util.List;

import domain.MovieReview;
import domain.MovieSearchRequest;

/**
 * интерфейс с методом принемающий фильм возвращающий список с отзывами-рекомендациями
 */
public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
