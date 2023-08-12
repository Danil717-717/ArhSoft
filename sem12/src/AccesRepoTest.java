import static org.junit.jupiter.api.Assertions.*;

class AccesRepoTest {

    @org.junit.jupiter.api.Test
    void getAccesLine() {
        AccesRepo testRepo = new AccesRepo("login=admin;pass=admin", "TokensDB");
        assertEquals("login=admin;pass=admin", testRepo.getAccesLine());
    }

    @org.junit.jupiter.api.Test
    void setAccesLine() {
        AccesRepo testRepo = new AccesRepo("login=admin;pass=admin", "TokenDB");
        testRepo.setAccesLine("login=root;pass=root");
        assertEquals("login=root;pass=root", testRepo.getAccesLine());
    }

    @org.junit.jupiter.api.Test
    void getAdressDB() {
    }

    @org.junit.jupiter.api.Test
    void setAdressDB() {
    }
}