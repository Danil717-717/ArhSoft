package application;

import domain.MovieSearchRequest;

/**
 * класс с одержащий команду от User
 */
public class MovieUser {
    /**
     * поле команды
     */
    private IUserInput userInputDriverPort;
    
    /**
     * конструктор класса принемающий команду
     * @param userInputDriverPort
     */
    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    /**
     * метод принемающий искомый фильм
     * @param movieSearchRequest
     * передает его
     */
    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
