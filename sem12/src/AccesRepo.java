import java.util.ArrayList;
import java.util.List;

public class AccesRepo {
    private String accesLine;
    private String adressDB;
    private List<User> user;
    private List<Token> tiken;
    private List<Group> group;

    public AccesRepo(String line, String adress) {
        this.accesLine = line;
        this.adressDB = adress;

        user = new ArrayList<>();
        tiken = new ArrayList<>();
        group = new ArrayList<>();
    }

    public String getAccesLine() {
        return accesLine;
    }

    public void setAccesLine(String accesLine) {
        this.accesLine = accesLine;
    }

    public String getAdressDB() {
        return adressDB;
    }

    public void setAdressDB(String adressDB) {
        this.adressDB = adressDB;
    }

    public Token findToken(User user){
        return null;
    }
}
