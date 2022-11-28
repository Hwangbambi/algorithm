package codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class num20 {
    public String solution(String s) {
        //문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴
        //s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주
        //"Zbcdefg"	"gfedcbZ"

        //1. 문자열 모두 자르고 내림차순으로 정렬
        String[] s_split = s.split("");

        String answer = "";

        Arrays.sort(s_split, Comparator.reverseOrder()); // 내림차순
        for (String s1 : s_split) {
            answer += s1;

        }

        return answer;
    }
        public static void main (String[]args){
            String s = "Zbcdefg";
            new num20().solution(s);

        }

}