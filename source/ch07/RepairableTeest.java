package source.ch07;

public class RepairableTeest {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Dropship2 dropship = new Dropship2();
        Marine2 marine = new Marine2();
        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);
    }
}
interface Repairable {}
class Unit3 {
    int hitPoint;
    final int MAX_HP;
    Unit3(int hp) {
        MAX_HP = hp;
    }
    // ..
}
class GroundUnit extends Unit3 {    // 보병
    GroundUnit(int hp) {
        super(hp);
    }
}
class AirUnit extends Unit3 {       // 기병
    AirUnit(int hp) {
        super(hp);
    }
}
class Tank2 extends GroundUnit implements Repairable {
    Tank2() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
    // ...
}
class Dropship2 extends AirUnit implements Repairable {
    Dropship2() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
    // ...
}
class Marine2 extends GroundUnit {
    Marine2() {
        super(40);
        hitPoint = MAX_HP;
    }
    // ...
}
class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(100);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r) {
        Unit3 u = (Unit3) r;
        while(u.hitPoint != u.MAX_HP) {
            u.hitPoint++;
        }
        System.out.println(u.toString() + "의 수리가 끝났습니다.");
    }
    // ...
}
