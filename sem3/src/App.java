import HomeWork.BMW;
import HomeWork.Car;
import HomeWork.Mersedes;
import HomeWork.Volga;

public class App {
    public static void main(String[] args) throws Exception {
        Volga volga = new Volga();
        volga.refueling();

        BMW bmw = new BMW("BMW", "740", "black", "sedan", 4, "automatic", (float) 4.0);
        Mersedes mers = new Mersedes("Mersedes", "CLS", "black", "sedan", 4, "automatic", (float) 4.5);

        bmw.driving();
        mers.driving();
        bmw.refueling();
        mers.refueling();
    }

}
