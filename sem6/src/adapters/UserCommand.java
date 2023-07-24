package adapters;

import application.IFetchMovieReviews;
import application.IPrintMovieReviews;
import application.IUserInput;
import application.MovieApp;
import domain.Model;
import domain.MovieSearchRequest;

/**
 * класс адаптер 
 * имплементирует интерфейс IUserInput
 */
public class UserCommand implements IUserInput {
    /**
     * работа с сущностью Model
     */
    private Model model;

    /**
     * конструктор класса принемает ссылки на интерфесы
     * @param fetchMovieReviews
     * @param printMovieReviews
     * создает обьект класса MovieApp и Model
     */
    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    /**
     * переопределенный метод интерфейса
     * принемает обьект класса userCommand
     * запускает метод Run класса Model,
     * тот в свою очеоедь запускает метод
     * accept класса MovieApp который 
     * печатает отзывы в консоль
     */
    @Override
    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}

