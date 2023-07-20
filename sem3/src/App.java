import DIP.DieselEngine;
import HomeWork.Suv;
import HomeWork.Gasolinefuel;
import HomeWork.Sedan;
import HomeWork.ConceptCar;

public class App {
    public static void main(String[] args) throws Exception {
        ConceptCar volga = new ConceptCar();
        volga.refueling();
        DieselEngine dieselEngine= new DieselEngine();
        Gasolinefuel gasolinefuel = new Gasolinefuel();

        Suv bmw = new Suv("BMW", "X7", "black", "SUV", 4, "automatic", (float) 4.0);
        
        Sedan mers = new Sedan("Mersedes", "CLS", "black", "sedan", 4, dieselEngine, "automatic", (float) 4.5);

        bmw.driving();
        mers.driving();
        bmw.refueling();
        mers.refueling();
    }

}
