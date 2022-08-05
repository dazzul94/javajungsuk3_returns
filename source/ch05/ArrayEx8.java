package source.ch05;

// 로또번호 생성 예제
public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i = 0; i < 45; i++) {
            ball[i] = i + 1;
        }

        int temp = 0;
        int j = 0;

        for(int i = 0; i < 6; i++) {
            j = (int)(Math.random() * 45);
            temp = ball[j];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for(int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
