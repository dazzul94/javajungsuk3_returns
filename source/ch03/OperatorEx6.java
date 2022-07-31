package source.ch03;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);        // 연산결과가 int라서
        System.out.println(c);
    }
}
