package codingTest;

public class num11 {
    public static int solution(long num) {
        //1-1. 입력된 수가 짝수라면 2로 나눕니다.
        //1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        //2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        //주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 총 8번 만에 1이 됩니다
        //위 작업을 몇 번이나 반복해야 하는지 반환
        //주어진 수가 1인 경우에는 0 , 작업을 500번 반복할 때까지 1이 되지 않는다면 –1

        //long 타입으로 바꾸는 이유는 알고리즘 북마크 참조
        int answer = 0;

        //1.주어진 수가 1인 경우에는 0 리턴
        if (num == 1) {
            return answer;
        }

        while (answer <= 500 && num != 1){
            if (num % 2 == 0){
                num /= 2;

            } else {
                num = (num * 3) + 1;

            }

            answer++;

        }

        if (num != 1) {
            return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int num = 626331;
        int answer = solution(num);
        System.out.println(answer);

    }

}
