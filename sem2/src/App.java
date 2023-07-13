import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemFabrica;
import Classes.Rewards.Gener.BodyArmorGenerator;
import Classes.Rewards.Gener.DiamondGenerator;
import Classes.Rewards.Gener.ExplosionGenerator;
import Classes.Rewards.Gener.GemGenerator;
import Classes.Rewards.Gener.GoldGenerator;
import Classes.Rewards.Gener.SilverGenerator;
import Classes.Rewards.Gener.StillLifeGenerator;
import SinPattern.InitializedSingleton;

public class App {
    public static void main(String[] args) throws Exception {
        ItemFabrica generator = new GoldGenerator();
        generator.openReward();
        generator = new GemGenerator();
        generator.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabrica> fabricaList = new ArrayList<>();

        fabricaList.add(new GemGenerator());
        fabricaList.add(new GoldGenerator());
        fabricaList.add(new StillLifeGenerator());
        fabricaList.add(new BodyArmorGenerator());
        fabricaList.add(new SilverGenerator());
        fabricaList.add(new ExplosionGenerator());
        fabricaList.add(new DiamondGenerator());

        for(int i = 0; i < 20; i++){
            //int index = Math.abs(rnd.nextInt()%2)==0?0:1;
            //int index = (int) (Math.random() * fabricaList.size());
            int index = rnd.nextInt(fabricaList.size());
            ItemFabrica fabrica = fabricaList.get(index);
            fabrica.openReward();
        }

        InitializedSingleton.getInstance();
        InitializedSingleton.getInstance();
    }
}
