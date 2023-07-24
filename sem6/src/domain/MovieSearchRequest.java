package domain;

/**
 * класс получение отзыва фильма
 */
public class MovieSearchRequest {
    String request;

    /**
     * конструктор класса
     * @param name - название фильма
     */
    public MovieSearchRequest(String name) {
        this.request = name;
    }

    
    public String getMovieName() {
        return request;
    }
}
