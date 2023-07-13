package Classes.Rewards.Reward;

import Classes.iGameItem;

public class ExplosionReward implements iGameItem{

    @Override
    public void open() {
        System.out.println("BOOOM!");
    }
    
}
