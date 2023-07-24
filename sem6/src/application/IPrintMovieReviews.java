package application;

import java.util.List;

import domain.MovieReview;

public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
