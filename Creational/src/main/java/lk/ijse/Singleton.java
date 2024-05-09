package lk.ijse;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        return singleton==null? singleton=new Singleton():singleton;
    }
}
