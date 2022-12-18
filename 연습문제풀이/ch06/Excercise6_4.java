package 연습문제풀이.ch06;

public class Excercise6_4 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
//        s.name = "홍길동";
//        s.ban = 1;
//        s.no = 1;
//        s.kor = 100;
//        s.eng = 60;
//        s.math = 76;
        System.out.println("이름: " + s.name);
        System.out.println("총점: "+ s.getTotal());
        System.out.println("평균: " + s.getAverage());

        System.out.println(s.info());
    }
}
class Student {
    String name;    // 학생이름
    int ban;        // 반
    int no;         // 번호
    int kor;        // 국어점수
    int eng;        // 영어점수
    int math;       // 수학점수

    Student() {}
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return this.kor + this.eng + this.math;
    }
    float getAverage() {
//        return Math.round(getTotal() / 3f * 10) / 10f;
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
    String info() {
        return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + getTotal() + "," + getAverage();
    }
}
