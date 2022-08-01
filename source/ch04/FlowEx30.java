package source.ch04;

public class FlowEx30 {
    public static void main(String[] args) {
        // break는 자신이 포함된 가장 가까운 반복문을 빠져나간다.

        int sum = 0;
        int i = 0;

        while(true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        } // end of while

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
