package codingTest;

public class num7 {
    public static int[] solution(long n) {
        int count = 0;

        //n 변수에 담긴 숫자를 String 으로 변환
        String n_string = String.valueOf(n);

        //문자열(숫자) 길이
        int n_length = n_string.length();

        int[] answer = new int[n_length]; // 답을 저장 할 배열

        //6번과 같은 원리
        while(n > 0) {
            answer[count] = (int) (n % 10); //소괄호 꼭 하기
            n /= 10;
            count++;

        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        num7.solution(n);
    }
}
