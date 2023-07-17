package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private long card;
    private int balance;
    private long oldCard;


    /**
     * коструктор класса
     */
    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

     public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getOldCard() {
        return oldCard;
    }

    public void setOldCard(long oldCard) {
        this.oldCard = oldCard;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}


   