package codingTest;

public class Today221204_8 {
    //Q. 음양 더하기
    //signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
    //실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] *= -1;
            }
            answer += absolutes[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        Today221204_8.solution(absolutes,signs);
    }
}
