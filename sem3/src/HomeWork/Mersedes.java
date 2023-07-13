package HomeWork;


/**
 * класс наследник абстрактного класса Car
 */
public class Mersedes extends Car implements iGasStation{

    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private String earboxType;
    private float engineCapacity;
    

    public Mersedes(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType,
            String earboxType, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.earboxType = earboxType;
        this.engineCapacity = engineCapacity;
    }

    /**
     * реализация абстрактных методов родительского класса
     */
    @Override
    public void driving() {
        System.out.println("Поехали! ");
    }

    @Override
    public void service() {
        System.out.println("Пора заехать в сервис");
    }

    @Override
    public void gearShift() {
        System.out.println("Переключение");
    }

    @Override
    public void headlightsOn() {
        System.out.println("Фары горят");
    }

    @Override
    public void turningOnWipers() {
        System.out.println("Дворники вжух");
    }

    /**
     * реализация метода interface
     */
    @Override
    public void refueling(){
        System.out.println("Zapravka gasoline");
    }
    
}

    

