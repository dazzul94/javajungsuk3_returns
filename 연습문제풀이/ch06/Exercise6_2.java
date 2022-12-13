package 연습문제풀이.ch06;

public class Exercise6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
class SutdaCard {
    int num;    // 카드의 숫자.(1~10사이의 정수)
    boolean isKwang; // 광이면 true, 아니면 false

    SutdaCard() {
//        this.num = 1;
//        this.isKwang = true;
        this(1, true);      // 매개변수가 있는 생성자 호출
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    String info() {
        return num + (isKwang?"K":"");
    }
}
