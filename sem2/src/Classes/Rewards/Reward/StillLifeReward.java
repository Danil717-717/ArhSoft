package Classes.Rewards.Reward;

import Classes.iGameItem;

public class StillLifeReward implements iGameItem{

    @Override
    public void open() {
        System.out.println("+Life");
    }
    
}
