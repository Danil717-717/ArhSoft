package HomeWork;


/**
 * класс наследник абстрактного класса Car
 */
public class Sedan extends Car implements iGasStation{

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
      public Sedan(String brand, String model, String color, String bodyType, int numberOfWheels,
      String earboxType, float engineCapacity) {
        super(brand, model, color, bodyType, numberOfWheels, earboxType, engineCapacity);
        this.iGasStation = new Gasolinefuel();
        this.fuelType = "gasoline";
    }

    

    /**
     * реализация абстрактных методов родительского класса
     */
    /**
     * метод движения
     */
    @Override
    public void driving() {
        System.out.println("Поехали! ");
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
        System.out.println("Mersedes refueling: " + fuelType);
    }
    
}

    

