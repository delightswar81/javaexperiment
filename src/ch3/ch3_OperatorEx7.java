package ch3;

public class ch3_OperatorEx7 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a*b);   //byte의 값의 범위를 넘어서는 값을 byte로 변경하면 데이터 손실이 온다.
        System.out.println(c);
    }
}
