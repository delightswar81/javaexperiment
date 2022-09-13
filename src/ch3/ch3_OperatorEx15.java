package ch3;

public class ch3_OperatorEx15 {

    public static void main(String args[]){
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);
        // 소문자에서 32만큼 뺀 자리수에 뭐가 나오는지 확인하는 법.
        System.out.println(upperCase);
        // 그러면 capital A가 나온다.
    }
}
