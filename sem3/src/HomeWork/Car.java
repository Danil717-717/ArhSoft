package HomeWork;

/**
 * абстрактный класс Car
 */
public abstract class Car {
    
    
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private String gearboxType;
    private float engineCapacity;
    
    /**
     * конструктор
     * @param brand          - марка
     * @param model          - модель
     * @param color          - цвет
     * @param bodyType       - тип кузова
     * @param numberOfWheels - кол-во колес
     * @param earboxType     - тип КПП
     * @param engineCapacity - обьем двигателя
     */

    public Car(String brand, String model, String color, String bodyType, int numberOfWheels,
            String gearboxType, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.gearboxType = gearboxType;
        this.engineCapacity = engineCapacity;
    }

    /**
     * пустой конструктор для класса ConceptCar
     */
    public Car() {
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
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    
    
}
