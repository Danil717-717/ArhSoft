package Classes.Rewards.Gener;

import Classes.ItemFabrica;
import Classes.iGameItem;
import Classes.Rewards.Reward.ExplosionReward;

public class ExplosionGenerator extends ItemFabrica{

    @Override
    public iGameItem createItem() {
        return new ExplosionReward();
    }
    
}
