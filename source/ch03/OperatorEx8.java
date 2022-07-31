package source.ch03;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        long c = (long)a * b;       // 연산결과가 int형인데 overflow
        System.out.println(c);
    }
}
