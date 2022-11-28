package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class num19 {
    public String[] solution(String[] strings, int n) {
        //주어진 인덱스의 문자를 오른차순 시키고, 정렬된 strings 배열에서 맞는 것을 찾아 바꿔준다.
        //strings를 정렬하는 이유는 같은 문자열일 때, 사전순으로 정렬하기 위함이다.
        //한 번 참조한 strings의 문자열은 제거해주기 위해 ArrayList를 사용한다
        //!!!!!다시 풀어보기!!!!!!!!!!

        String[] answer = new String[strings.length];

        Arrays.sort(strings);

        //n번째 문자열만 저장할 배열
        String[] n_substring = new String[strings.length];

        //n번째 문자열 찾고 저장
        for (int i = 0; i < strings.length; i++) {
            n_substring[i] = strings[i].substring(n,n+1);
        }

        Arrays.sort(n_substring);

        ArrayList<String> stringsList = new ArrayList<>(Arrays.asList(strings));
        for (int i = 0; i < answer.length; i++){
            for (int j = 0; j < stringsList.size(); j++) {
                if (stringsList.get(j).substring(n,n+1).equals(n_substring[i])) {
                    answer[i] = stringsList.get(j);
                    stringsList.remove(j);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        new num19().solution(strings, n);

    }
}
