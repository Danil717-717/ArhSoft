package Classes.Rewards.Gener;

import Classes.ItemFabrica;
import Classes.iGameItem;
import Classes.Rewards.Reward.DiamondReward;

public class DiamondGenerator extends ItemFabrica{

    @Override
    public iGameItem createItem() {
        return new DiamondReward();
    }
    
}
