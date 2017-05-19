package AdvancedJava.ConstructorPatterns;

//thread safe singleton
public class EagerSingleton {
    public static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton() {
    }

    static public EagerSingleton getInstance(){
        return instance;
    }
}
