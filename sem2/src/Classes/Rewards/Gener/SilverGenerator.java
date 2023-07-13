package Classes.Rewards.Gener;

import Classes.ItemFabrica;
import Classes.iGameItem;
import Classes.Rewards.Reward.SilverReward;

public class SilverGenerator extends ItemFabrica{

    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
    
}
