package ch3;

public class ch3_OperatorEx18 {
    public static void main(String args[]){
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // Math.round는 괄호 안의 숫자를 반올림 해주는 것이다.
        System.out.println(shortPi);
    }

}
