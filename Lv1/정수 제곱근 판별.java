package codingTest;

public class num9 {
    public static long solution(long n) {
        //정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
        //n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴
        //n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
        //ex) 121은 11의 제곱이므로 (11+1)을 제곱한 144 리턴
        //    3은 양의 정수의 제곱이 아니므로 -1 리턴

        long sqrt = (long) Math.sqrt(n);
        long answer = 0;

        if (sqrt * sqrt == n) {
            answer = (sqrt + 1) * (sqrt + 1);

        } else {
            answer = -1;

        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 144;
        long answer = solution(n);

        System.out.println(answer);

    }
}
