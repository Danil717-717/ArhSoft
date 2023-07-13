package Classes.Rewards.Gener;

import Classes.ItemFabrica;
import Classes.iGameItem;
import Classes.Rewards.Reward.BodyArmorReward;

public class BodyArmorGenerator extends ItemFabrica{

    @Override
    public iGameItem createItem() {
        return new BodyArmorReward();
    }
    
}
