package domain;

import application.MovieApp;

/**
 * класс неизменяемой сущности
 */
public class Model {

    /**
     * обьект класса MovieApp
     */
    private MovieApp movieApp;

    /**
     * конструктор класса
     * @param movieApp
     */
    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    /**
     * метод запуска логики приложения
     * @param movieSearchRequest
     */
    public void Run(MovieSearchRequest movieSearchRequest)
    {
        movieApp.accept(movieSearchRequest);
    }

}
