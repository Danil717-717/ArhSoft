package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<>();

    
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashs, List<Camera> cameras) throws Exception {
        this.id = id;
        if(models.size() > 0){
            this.models = models;
        }else{
            throw new Exception("Должна быть одна модель");
        }
        this.flashes = flashes;
        if(cameras.size() > 0){
            this.cameras = cameras;
        }else{
            throw new Exception("Должна быть одна камера");
        }
        
    }

    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }

    //или
    /*
     * public <T> T method1(T flash){
     *      return flash;
     * }
     * 
     * public <T, E> T method2(T Model, E Flash){
     *      return Model;
     * }
     */
}
