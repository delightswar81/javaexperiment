package ch3;

public class ch3_OperatorEx6 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);//a+b가 byte 형태가 아닐 수 있기 때문에 이런 일을 한다고 볼 수있다.
        System.out.println(c);
    }

}
