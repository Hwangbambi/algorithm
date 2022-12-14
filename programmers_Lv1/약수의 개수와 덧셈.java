package codingTest;

public class Today221209 {
    //Q. 약수의 개수와 덧셈
    //두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    // 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

     public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++){
            int measureCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    measureCount++;
                }
            }
            if (measureCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
         
        /* 다른 사람 풀이 - Math.sqrt() : 제곱근 구하는 함수
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            ex) 25 : 1 5 25
            
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
        return answer;*/
    }

    public static void main(String[] args) {
        Today221209.solution(13,17);
    }
}
