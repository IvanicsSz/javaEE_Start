package AdvancedJava.ConstructorPatterns;


//not a thread safe manner lazy fashion
public class NaiveSingleton {
    public static NaiveSingleton instance;

    public NaiveSingleton() {
    }

    public static NaiveSingleton getInstance(){
        if (instance == null){
            instance = new NaiveSingleton();
        }
        return instance;
    }
}
