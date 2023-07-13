package SinPattern;

public class InitializedSingleton {
    private static InitializedSingleton instance;
    private InitializedSingleton(){};

    public static InitializedSingleton getInstance(){ 
        if(instance == null){		//если объект еще не создан
            instance = new InitializedSingleton();	//создать новый объект
            System.out.println("Create player");
        }
        return instance;		// вернуть ранее созданный объект
    }
}
