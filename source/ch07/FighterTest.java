package source.ch07;

public class FighterTest {
    public static void main(String[] args) {
        Figheter f = new Figheter();
        if(f instanceof Unit2) {
            System.out.println("f는 Unit의 자손입니다.");
        }
        if(f instanceof Figheter) {
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        }
        if(f instanceof Movable) {
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        }
        if(f instanceof Attackable) {
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        }
        if(f instanceof Object) {
            System.out.println("f는 Object클래스의 자손입니다.");
        }
    }
}
class Figheter extends Unit2 implements Fightable {
    public void move(int x, int y) { /* 내용 생략 */}
    public void attack(Unit2 u) { /* 내용 생략 */ }
}
class Unit2 {
    int currentHP;      // 유닛의 체력
    int x;              // 유닛의 위치(x좌표)
    int y;              // 유닛의 위치(y좌표)
}
interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit2 u); }
