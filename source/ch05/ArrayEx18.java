package source.ch05;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {       // 4행 3열 이차원 배열
                {100, 100, 100}   // 첫번째 배열
                , {20, 20, 20}    // 두번째 배열
                , {30, 30, 30}    // 세번째 배열
                , {40, 40, 40}    // 네번째 배열
        };
        int sum = 0;

        for(int i = 0; i < score.length; i++) {         // score.length = 4;
            for(int j = 0; j < score[i].length; j++) {  // score[i].length = 3;
                System.out.printf("score[%d][%d]=%d%n", i, j ,score[i][j]);
            }
        }

        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }

        System.out.println("sum=" + sum);
    }
}
