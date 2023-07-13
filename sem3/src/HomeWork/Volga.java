package HomeWork;

/**
 * класс из 2 задания наследник абстрактного
 * класса Car и имплементирующий interface
 * iGasStation
 */
public class Volga extends Car implements iGasStation{
    
    @Override
    public void refueling(){
        System.out.println("Zapravka");
    }

    @Override
    public void driving() {
    }

    @Override
    public void service() {
    }

    @Override
    public void gearShift() {
    }

    @Override
    public void headlightsOn() {
    }

    @Override
    public void turningOnWipers() {
    }
}
