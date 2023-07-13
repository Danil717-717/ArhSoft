package Classes.Rewards.Gener;

import Classes.ItemFabrica;
import Classes.iGameItem;
import Classes.Rewards.Reward.GoldReward;

public class GoldGenerator extends ItemFabrica{

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
    
}
