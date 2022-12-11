package source.ch07;

public class StarcraftTest {
    public static void main(String[] args) {
        // 추상클래스
        // 추상클래스는 인스턴스를 생성할 수 없으며 추상메서드를 포함하면 추상클래스로 표현한다.
        // 상속을 통해서 구현해야 하는데, 이때 추상메서드를 오버라이딩 해야한다.
    }
}
abstract class Unit {
    int x, y;
    abstract void move(int x, int y); /* 지정된 위치로 이동 */
    abstract void stop(); /* 현재 위치에 정지 */
}
class Marine extends Unit {
    int x, y;
    void move(int x, int y) {
        /* 지정된 위치로 이동 */
    }
    void stop() {
        /* 현재 위치에 정지 */
    }
}
class Tank extends Unit {
    int x, y;
    void move(int x, int y) {
        /* 지정된 위치로 이동 */
    }
    void stop() {
        /* 현재 위치에 정지 */
    }
}
class Dropship extends Unit {
    int x, y;
    void move(int x, int y) {
        /* 지정된 위치로 이동 */
    }
    void stop() {
        /* 현재 위치에 정지 */
    }
}
