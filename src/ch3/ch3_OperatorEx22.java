package ch3;

public class ch3_OperatorEx22 {
    public static void main(String args[]){
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0==10.0f  %b%n", 10.0==10.0f);
        System.out.printf("0.1==0.1f    %b%n", 0.1==0.1f);
        System.out.printf("f = %19.17f%n", f);
        System.out.printf("d = %19.17f%n", d);
        System.out.printf("d2 =%19.17f%n", d2);
        System.out.printf("d==f  %b%n", d==f);
        System.out.printf("d==d2 %b%n", d==d2);
        System.out.printf("d2==f %b%n", d2==f);
        System.out.printf("(float)d==f %b%n", (float)d==f);
    }

}
/*
이 예제의 결과를 보고 다소 혼란스로울 것이다. '10.0==10.0f'는 true인데 '0.1==0.1f'는 false라니 이해하기 어렵다.
왜 이런 겨로가를 얻는 것일까?
그것은 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 있기 때문이다.

10.0f는 오차없이 저장할 수 있는 값이라서 double로 형변환해도 그대로 10.0이 되지만, 0.1f는 저장할 때 2진수로 변환하는 과정에서 오차가 발생한다.
double타입의 상수인 0.1도 저장되는 과정에서 오차가 발생하지만, float타입의 리터럴인 0.1f보다 적은 오차로 저장된다.

    float f = 0.1f     // f에 0.10000000149011612로 저장된다.
    double d = 0.1;    // d에 0.10000000000000001로 저장된다.

이미 앞서 배운 것처럼 float타입의 값을 double타입으로 형변환하면, 부호와 지수는 달라지지 않고 그저 가수의 빈자리를 0으로 채울 뿐이므로 0.1f를 double타입으로 형변환해도 그 값은 전혀 달리지지 않는다.
즉, float타입의 갑슬 정밀도가 더 높은 double타입으로 형변환했다고 해서 오차가 적어지는 것이 아니라는 얘기다.

 */