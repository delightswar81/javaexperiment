package ch1;

public class PrintfEx2 {
    public static void main(String[] args){
        String url = "www.codechobo.com";

        float f1 = .10f;    // 0.10, 1.0e-1
        float f2 = 1e1f;    // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);   // 0.10을 다르게 출력하는 방법
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);   // 10.0을 다르게 출력하는 방법
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);   // 314를 다르게 출력하는 방법

        /*
        실수를 출력할 때, f를 많이 사용하는데, 간단하게 표현하기 위해서 g를 사용할 때도 있다.
        단, 소숫점도 한 자리를 차지한다.
         */

        System.out.printf("d=%f%n", d); // 1.23456789을 floa로 출력한다.
        System.out.printf("d=%14.10f%n",d); // 전체 14자리 중 소수점 10자리를 출력한다

        /*
        f를 표현할 때, 6자리수만 출력하는데, 더 많은 자릿 수를 표현하기 위해서 자릿수를 정해줄 수 있다.
         */

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n",url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);    //왼쪽 정렬
        System.out.printf("[%..8s]%n", url);    //왼쪽 8글자만 출력
    }
}
