public class Singleton {

    private static Singleton singleton = null;
    public String s;

    private Singleton(){
        s = "String of singleton";
    }

    public static Singleton getInstance(){
        if(singleton == null){
            return singleton = new Singleton();
        }
        else
            return singleton;
    }

}
