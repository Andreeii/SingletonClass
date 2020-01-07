public class Main {

    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton w = Singleton.getInstance();

        x.s =(x.s).toUpperCase();

        System.out.println(x.s);
        System.out.println(y.s);

        w.s =(w.s).toLowerCase();

        System.out.println(w.s);
        System.out.println(x.s);
    }
}
