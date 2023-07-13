package Classes.Rewards.Gener;

import Classes.ItemFabrica;
import Classes.iGameItem;
import Classes.Rewards.Reward.StillLifeReward;

public class StillLifeGenerator extends ItemFabrica{

    @Override
    public iGameItem createItem() {
        return new StillLifeReward();
    }
    
}