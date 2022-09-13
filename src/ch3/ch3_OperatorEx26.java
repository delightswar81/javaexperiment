package ch3;

public class ch3_OperatorEx26 {
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!= = %b%n", a==0 && ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);
    }

    /*
    논리 연산자가 효율적인 연산을 하는지 확인하는 예제이다.
    변수 b에 증감 연산자 '++'을 사용해서 우측피연산자가 처리되면, b의 값이 증가하도록 했다.
     그러나 실행 결과에서 알 수 있듯이, 두 번의 논리연산 후에도 b의 값은 여전히 0인 채로 남아있다. '||(or)'의 경우는 좌측 피연산자(a!=0)가 거짓이라서 우측 피연산자를 평가하지 않았기 떄무닝다.
     */
}

