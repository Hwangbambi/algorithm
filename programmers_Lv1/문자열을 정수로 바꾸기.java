package codingTest;

public class Today221204_2 {
    public static int solution(String s) {
        //Q. 문자열을 정수로 바꾸기
        //문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "-1234";
        Today221204_2.solution(s);
    }
}
