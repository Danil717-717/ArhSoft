package Classes.Rewards.Reward;

import Classes.iGameItem;

public class DiamondReward implements iGameItem{

    @Override
    public void open() {
        System.out.println("DIAMOND!");
    }
    

}
