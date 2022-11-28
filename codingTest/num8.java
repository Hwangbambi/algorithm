package codingTest;

import java.util.Arrays;
import java.util.Collections;

public class num8 {
    public static long solution(long n) {
        //8번 문제
        //n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴
        //예를들어 n이 118372면 873211을 리턴하면 됩니다.

        //1. 문자열로 변환
        String n_string = String.valueOf(n);

        //2. 하나씩 쪼개기
        String[] n_split = n_string.split("");

        //3. 내림차순 정렬
        Arrays.sort(n_split, Collections.reverseOrder());

        String sum = "";

        for (String nn : n_split){
            sum += nn;

        }

        long n_long = Long.parseLong(sum);

        long answer = n_long;

        return answer;
    }

    public static void main(String[] args) {
        long n = 118372;
        long answer = solution(n);

        System.out.println(answer);

    }
}
