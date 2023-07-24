package application;

import java.util.List;

import domain.MovieReview;

/**
 * интерфейс с методом принемающий список с отзывами-рекомендациями для печатати
 */
public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
