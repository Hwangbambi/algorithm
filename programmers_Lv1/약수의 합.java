package codingTest;

public class Today1128 {
    //약수의 합
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 1;
        Today1128.solution(n);

    }
}
