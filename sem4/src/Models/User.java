package Models;

import java.util.Objects;

/**
 * Модель пользователя
 */
public class User {

    private int id;
    private String userName;
    private long cardNumber;
    private int hashPassword;

    /**
     * 
     * @param id            - id пользователя
     * @param userName      - имя пользователя
     * @param hashPassword  - хеш пароля
     * @param cardNumber    - номер карты
     */
    public User(int id, String userName, int hashPassword, long cardNumber) {
        this.id = id;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.cardNumber = cardNumber;
    }

    /**
     * геттеры сетеры
     * 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(int hashPassword) {
        this.hashPassword = hashPassword;
    }


    @Override
    public String toString() {
        return "Client { " +
                "id= " + id +
                ", userName= " + userName +
                ", cardNumber= " + (String.format("%016d", cardNumber)) +
                " }";
    }

    /**
     * метод проверки действительности
     * предаваемого типа и проверки на null
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        User client = (User) o;
        return this.equals(client);
    }

    /**
     * метод проверки с уже имеющимися 
     * ползователями и паролями
     * @param client
     * @return
     */
    public boolean equals(User client) {
        return id == client.id && hashPassword == client.hashPassword && cardNumber == client.cardNumber && userName.equals(client.userName);
    }

    /**
     * не уверен
     * метод возвращения пользователя с его давнными
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, userName, hashPassword, cardNumber);
    }
}


    