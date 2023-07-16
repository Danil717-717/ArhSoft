import DIP.DieselEngine;
import HomeWork.BMW;
import HomeWork.Gasolinefuel;
import HomeWork.Mersedes;
import HomeWork.Volga;

public class App {
    public static void main(String[] args) throws Exception {
        Volga volga = new Volga();
        volga.refueling();
        DieselEngine dieselEngine= new DieselEngine();
        Gasolinefuel gasolinefuel = new Gasolinefuel();

        BMW bmw = new BMW("BMW", "740", "black", "sedan", 4, "automatic", (float) 4.0);
        Mersedes mers = new Mersedes("Mersedes", "CLS", "black", "sedan", 4, "automatic", (float) 4.5);

        bmw.driving();
        mers.driving();
        bmw.refueling();
        mers.refueling();
    }

}
