import adapters.ConsolePrinter;
import adapters.MovieReviewsRepo;
import adapters.UserCommand;
import application.IFetchMovieReviews;
import application.IPrintMovieReviews;
import application.IUserInput;
import application.MovieUser;
import domain.MovieSearchRequest;

public class Main {
    public static void main(String[] args) {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        //создается репозиторий
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();
        //создается принтер
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);
        //создается команда содержащая ссылки обьектов репозитория и принтера

        //обьект класса MovieUser
        MovieUser movieUser = new MovieUser(userCommand);
        //о этих фильмах нужна инфа
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        //запуск логики приложения
        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);
        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);
    }
}
