package Classes.Rewards.Reward;

import Classes.iGameItem;

public class GoldReward implements iGameItem{

    @Override
    public void open() {
        System.out.println("Gold");
    }
    
}
