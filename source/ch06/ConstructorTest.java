package source.ch06;

class Data1 {
    int value;
}
class Data2 {
    int value;
    Data2(int x) {  // 매개변수가 있는 생성자, 생성자는 리턴타입이 없다.
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        // 기본생성자는 생성자가 하나도 없을때만 추가 된다.
//        Data2 d2 = new Data2();
    }
}
