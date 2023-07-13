package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangeObserver> changeObservers;

    /**
     * конструктор
     * 
     * @param texture
     * @throws Exception
     */
     public ModelStore(List<iModelChangeObserver> changeObservers)throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0,models,flashes,cameras));
    }

    /**
     * Возврвщает scene по ID
     * 
     * @param id
     * @return
     */
    public Scene getScena(int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
            return scenes.get(i);
            }
        }
        return null;
    }

    /**
     * Регистрация изменений
     * @param sender
     */
    @Override
    public void notifyChanger(iModelChanger sender) {
    }

}