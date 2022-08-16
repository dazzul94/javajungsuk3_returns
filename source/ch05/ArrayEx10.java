package source.ch05;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for(int i = 0; i < numArr.length-1; i++) {      // 하나의 작업을 n-1번해야한다.
            boolean changed = false;

            for(int j = 0; j < numArr.length-1-i; j++) {    // n-i번째까지 자리바꿈을 계속한다. 최댓값이 오른쪽에 계속 박힘
                if(numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            } // end for j
            if(!changed) break; // 정렬이 끝난것

            for(int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        } // end for i
    } // end of main
}
