package source.ch07;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D_3 p3 = new Point3D_3();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point_3 {
    int x = 10;
    int y = 20;

    Point_3(int x, int y) {
        // super();  Object 클래스의 생성자를 먼저 호출(컴파일러 자동추가)
        this.x = x;
        this.y = y;
    }
}

class Point3D_3 extends Point_3 {
    int z = 30;

    Point3D_3() {
        this(100, 200, 300);
    }
    Point3D_3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}