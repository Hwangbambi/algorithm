package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class num18 {
    public int[] solution(int[] answers) {
        //1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return
        //가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬
        //수포자 1은 모든 문제를 맞혔습니다.
        //수포자 2는 모든 문제를 틀렸습니다.
        //수포자 3은 모든 문제를 틀렸습니다.

        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++){
            if (student1[i%5] == answers[i]){
                System.out.println(i%5);
                count[0]++;
            }
            if (student2[i%8] == answers[i]){
               // System.out.println(student2[i%8]);
                count[1]++;
            }
            if (student3[i%10] == answers[i]){
             //   System.out.println(student3[i%10]);
                count[2]++;
            }
        }

        //가장 큰 count 값을 담음
        int max = 0;

        //가장 큰 count 값 구하기
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        //answer 인덱스
        int index = 0;

        //ArrayList<Integer> answerList = new ArrayList<>();


        //max 값과 동일한 값이 있는지 찾기 (공동 1위)
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                index++;
            }
        }

        int[] answer = new int[index];

        //answer 인덱스
        int index_a = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                answer[index_a] = i + 1;
                index_a++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] win_nums = {1,3,2,4,2};
        new num18().solution(win_nums);

    }
}
