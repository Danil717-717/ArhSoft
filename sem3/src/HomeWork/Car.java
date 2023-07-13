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

    
    
    public abstract void driving();
    public abstract void service();
    public abstract void gearShift();
    public abstract void headlightsOn();
    public abstract void turningOnWipers();
    
}
