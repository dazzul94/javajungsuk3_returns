package source.ch07;

import javafx.geometry.Point3D;

public class PointTest {
    public static void main(String[] args) {
    }
}
class Point_2 {
    int x, y;

    Point_2() {

    }
    Point_2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation () {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D_2 extends Point_2{
    int z;

    Point3D_2(int x, int y, int z) {
        // super(); 를 컴파일러가 자동으로 추가
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation () {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
