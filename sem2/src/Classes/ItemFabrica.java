package Classes;

public abstract class ItemFabrica {
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
    
}