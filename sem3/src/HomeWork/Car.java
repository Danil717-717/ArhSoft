package HomeWork;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private  String earboxType;
    private float engineCapacity;
    
    /**
     * пустой конструктор для класса Volga
     */
    public Car() {
    }

    /**
     * конструктор
     * @param brand          - марка
     * @param model          - модель
     * @param color          - цвет
     * @param bodyType       - тип кузова
     * @param numberOfWheels - кол-во колес
     * @param fuelType       - тип топлива
     * @param earboxType     - тип КПП
     * @param engineCapacity - обьем двигателя
     */
    public Car(String brand, String model, String color, String bodyType, int numberOfWheels,
            String earboxType, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.earboxType = earboxType;
        this.engineCapacity = engineCapacity;
    }

    
    
    public abstract void driving();
    public abstract void service();
    public abstract void gearShift();
    public abstract void headlightsOn();
    public abstract void turningOnWipers();


    /**
    * геттеры сеттеры
    */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEarboxType() {
        return earboxType;
    }

    public void setEarboxType(String earboxType) {
        this.earboxType = earboxType;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    
}
