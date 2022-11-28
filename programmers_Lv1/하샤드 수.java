package codingTest;

import java.util.stream.Stream;

public class num12 {
    public static boolean solution(int x) {
        //1. 문자열로 타입 변환 후 숫자 자릿수 나누기
        String[] x_string = String.valueOf(x).split("");

        //2. int 배열로 변환
        int[] x_int = Stream.of(x_string).mapToInt(Integer::parseInt).toArray();;

        boolean answer = true;
        int sum = 0;

        for (int xx : x_int) {
            sum += xx;
            if (x % sum == 0){
                answer = true;

            } else {
                answer = false;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int x = 121;
        boolean answer = solution(x);
        System.out.println(answer);

    }
}
