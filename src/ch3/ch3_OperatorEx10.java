package ch3;

public class ch3_OperatorEx10 {
    public static void main(String args[]){
        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
        // 먼저 곱하는 것은, int의 범위를 넘어서기 때문에 잘못된다.
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }
}
