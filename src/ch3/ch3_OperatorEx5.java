package ch3;

public class ch3_OperatorEx5 {
    public static void main(String args[]) {

        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float) b, a / (float) b);
        // 정수를 실수로 형변환하면, 4.000000로 변형된다.
    }
}
