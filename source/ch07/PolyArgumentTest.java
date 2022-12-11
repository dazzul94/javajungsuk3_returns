package source.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv3());
        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
class Product {
    int price;
    int bonusPoint;
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
}
class Tv3 extends Product {
    Tv3() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Buyer {       // 고객, 물건사는 사람
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보너스점수
    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}
