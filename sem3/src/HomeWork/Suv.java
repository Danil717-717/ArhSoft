package HomeWork;

/**
 * класс наследник абстрактного класса Car
 */
public class Suv extends Car implements iGasStation{

    //private String brand;
    //private String model;
    //private String color;
    //private String bodyType;
    //private int numberOfWheels;
    //private String fuelType;
    //private String earboxType;
    //private float engineCapacity;

    ///**
    // * конструктор
    // * @param brand          - марка
    // * @param model          - модель
    // * @param color          - цвет
    // * @param bodyType       - тип кузова
    // * @param numberOfWheels - кол-во колес
    // * @param fuelType       - тип топлива
    // * @param earboxType     - тип КПП
    // * @param engineCapacity - обьем двигателя
    // */
    //public BMW(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType,
    //        String earboxType, float engineCapacity) {
    //    this.brand = brand;
    //    this.model = model;
    //    this.color = color;
    //    this.bodyType = bodyType;
    //    this.numberOfWheels = numberOfWheels;
    //    this.fuelType = fuelType;
    //    this.earboxType = earboxType;
    //    this.engineCapacity = engineCapacity;
    //}

    private iGasStation iGasStation;
    private String fuelType;
    
     /**
      * 
      * @param brand           - марка
      * @param model           - модель
      * @param color           - цвет
      * @param bodyType        - тип кузова
      * @param numberOfWheels  - кол во колес
      * @param earboxType      - тип КПП
      * @param engineCapacity  - обьем двигателя
      * 
      */   
      public Suv(String brand, String model, String color, String bodyType, int numberOfWheels,
      String earboxType, float engineCapacity) {
        super(brand, model, color, bodyType, numberOfWheels, earboxType, engineCapacity);
        this.iGasStation = new Gasolinefuel();
        this.fuelType = "diesel";
    }

    /**
     * реализация абстрактных методов родительского класса
     */
    /**
     * метод движения
     */
    @Override
    public void driving() {
        System.out.println("Поехали! Черный дым...");
    }

    /**
     * метод ChekEngn
     */
    @Override
    public void service() {
        System.out.println("Пора заехать в сервис");
    }

    /**
     * метод переключение передачи
     */
    @Override
    public void gearShift() {
        System.out.println("Переключение");
    }

    /**
     * метод включения фар
     */
    @Override
    public void headlightsOn() {
        System.out.println("Фары горят");
    }

    /**
     * метод вкл дворников
     */
    @Override
    public void turningOnWipers() {
        System.out.println("Дворники вжух");
    }
    
    /**
     * реализация метода interface
     */
    @Override
    public void refueling(){
        iGasStation.refueling();
        System.out.println("BMW refueling: " + fuelType);
    }
}
