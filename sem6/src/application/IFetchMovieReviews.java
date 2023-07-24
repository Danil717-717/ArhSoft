package application;

import java.util.List;

import domain.MovieReview;
import domain.MovieSearchRequest;

public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
