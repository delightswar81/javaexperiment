/*
문자열의 비교
두 문자열을 비교할 때는, 비교 연산자 '=='대신 equals()라는 메서드를 사용해야 한다.
비교 연산자는 두 문자열이 완전히 같은 것인지 비교ㅏㄹ 뿐이므로, 문자열의 내용이 같은지 비교하기 위해서는 equals()를 사용하는 것이다.
equals는 비교하는 두 문자열이 같으면 true를, 다르면 false를 반환한다.

원래 String은 클래스이므로,new를 사용해서 객체를 생성해야 한다.

그러나 특별히 String만 new를 사용하지 않고, 위와 간단히 쓸 수 있게 허용한다.
위 두 문장은 거의 같지만, 한 가지 차이점이 있는데, 이에 대해서는 9장 java.lang패키지와 유용한 클래스에서 설명한다.지금은 문자열을 비교할 때 비교 연산자가 아니라 equals()를 사용해야한다는 것만 알면 된다.
 */
package ch3;

public class ch3_OperatorEx23 {
    public static void main(String args[]){
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\'abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b%n",  str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b%n",  str2=="abc");
        System.out.printf(" str1.equals(\"abc\") ? %b%n",  str1.equals("abc"));
        System.out.printf(" str2.equals(\"abc\") ? %b%n",  str2.equals("abc"));
        System.out.printf(" str2.equals(\"ABC\") ? %b%n",  str2.equals("ABC"));
        System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n",  str2.equalsIgnoreCase("ABC"));
    }
}
/*
str2와 'abc'의 내용이 같은데도 '=='로 비교하면, flase를 결과로 얻는다. 내용은 같지만 서로 다른 개게라서 그렇다
그러나 equals()는 객체가 달라도 내요이 같으면 true를 반환한다.
그래서 문자열을 비교할 때는 항상 equals()를 사용해야 한다는 것을 기억하자.
 만일 대소문자를 구별하지않고 비교하고 싶으면, equals()대신 equalsIgnoreCase()를 사용하면 된다.
 */
