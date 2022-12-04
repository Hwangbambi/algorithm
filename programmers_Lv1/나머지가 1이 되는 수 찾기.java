package codingTest;

public class Today221204_4 {
    //Q. 나머지가 1이 되는 수 찾기
    //자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.

    public static int solution(int n) {
        for (int x = 1; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Today221204_4.solution(10);
    }
}
