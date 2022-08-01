package source.ch04;

public class FlowEx29 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            System.out.printf("i=%d", i);

            int tmp = i;
            do {
                // 끝자리가 3의 배수이고 0이 아닐때(0은 제외해야함-3으로나눈나머지가0이니까)
                if(tmp%10%3==0 && tmp%10!=0) {
                    System.out.print("짝");
                }
            } while((tmp/=10)!=0);
            System.out.println();
        }
    }
}
