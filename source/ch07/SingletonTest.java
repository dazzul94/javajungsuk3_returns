package source.ch07;

final class Singleton {     // 상속할 수 없음. 고자클래스
    private static Singleton s = new Singleton();
    private Singleton() {
        // ...
    }
    public static Singleton getInstance() {
        if(s == null)
            s = new Singleton();
        return s;
    }
}
public class SingletonTest {
//    Singleton s = new Singleton();
    Singleton s = Singleton.getInstance();
}
