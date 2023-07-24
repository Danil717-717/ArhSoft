package adapters;

import application.IFetchMovieReviews;
import application.IPrintMovieReviews;
import application.IUserInput;
import application.MovieApp;
import domain.Model;
import domain.MovieSearchRequest;

public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}

