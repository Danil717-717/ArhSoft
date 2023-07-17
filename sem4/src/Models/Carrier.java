package Models;

import java.util.ArrayList;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private ArrayList<Integer> zones;
    private long cardNumber;
    private int zoneDepertures;
    private int zoneArrival;

    /**
     * конструктор класса
     * @param id         - id перевозчика
     * @param cardNumber - номер карты перевозчика
     * @param zoneDepertures - зона отправки
     * @param zoneArrival - зона прибытия
     */
    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
        ArrayList<Integer> zones = new ArrayList<>();
        zones.add(zoneDepertures);
        zones.add(zoneArrival);
    }

    /**
     * геттеры сеттеры
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ArrayList<Integer> getZones() {
        return zones;
    }

    public void setZones(ArrayList<Integer> zones) {
        this.zones = zones;
    }

    public int getZoneDepertures() {
        return zoneDepertures;
    }

    public void setZoneDepertures(int zoneDepertures) {
        this.zoneDepertures = zoneDepertures;
    }

    public int getZoneArrival() {
        return zoneArrival;
    }

    public void setZoneArrival(int zoneArrival) {
        this.zoneArrival = zoneArrival;
    }

    

}
