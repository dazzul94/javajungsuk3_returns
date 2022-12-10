package source.ch07;

class Card2 {
    // final로 선언된 변수는 생성자에서 초기화되도록 할 수 있다.
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;
    Card2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }
    Card2() {
        this("HEART", 1);
    }
    public String toString() {
        return KIND + " " + NUMBER;
    }
}
public class FinalCardTest {

    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 2);
//        c.NUMBER = 5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
