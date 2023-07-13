package Classes.Rewards.Gener;

import Classes.ItemFabrica;
import Classes.iGameItem;
import Classes.Rewards.Reward.GemReward;

public class GemGenerator extends ItemFabrica{
     @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
