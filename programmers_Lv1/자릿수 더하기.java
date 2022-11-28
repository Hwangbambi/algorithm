package codingTest;

public class num6 {
    public static int solution(int n) {
        int sum = 0;

        //ex) n = 12345;

        while(n > 0) {
            sum += n % 10;
            // 12345 % 10 = 1234.5 이므로 나머지 5가 sum에 저장
            // ...
            // 1 % 10 = 0.1 이런 식으로 나머지 5,4,3,2,1 sum 변수에 저장

            n /= 10;
            // n = 12345 / 10 = 1234
            // n = 1234 / 10 = 123
            // ... n = 1 / 10 = 0
        }

        int answer = sum;

        return answer;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(num6.solution(n));
    }
}
