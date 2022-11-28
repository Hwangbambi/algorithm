package codingTest;

import java.util.Arrays;

public class num17 {
    public int[] solution(int[] lottos, int[] win_nums) {
        //민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return
        //순위	당첨 내용
        //1	6개 번호가 모두 일치
        //2	5개 번호가 일치
        //3	4개 번호가 일치
        //4	3개 번호가 일치
        //5	2개 번호가 일치
        //6(낙첨)	그 외

        //1. 두 배열에서 중복되는 수 찾기
        //2. 최저 - if문으로 몇개 번호가 일치하면 몇위인지 리턴
        //3. 최고 -

        int[] answer = new int[2];

        //몇개가 일치하는지 저장할 변수
        int same_count = 0;

        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == win_nums[i]) {
                    same_count++;
                }
            }
        }

        //최저 순위 저장
        if (same_count == 6) {
            answer[1] = 1;
        } else if (same_count == 5) {
            answer[1] = 2;
        } else if (same_count == 4) {
            answer[1] = 3;
        } else if (same_count == 3) {
            answer[1] = 4;
        } else if (same_count == 2) {
            answer[1] = 5;
        } else {
            answer[1] = 6;
        }

        int zero_count = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                //0 갯수
                zero_count++;
            }
        }

        if (same_count + zero_count == 6) {
            answer[0] = 1;
        } else if (same_count + zero_count == 5) {
            answer[0] = 2;
        } else if (same_count + zero_count == 4) {
            answer[0] = 3;
        } else if (same_count + zero_count == 3) {
            answer[0] = 4;
        } else if (same_count + zero_count == 2) {
            answer[0] = 5;
        } else {
            answer[0] = 6;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        new num17().solution(lottos, win_nums);

    }
}
