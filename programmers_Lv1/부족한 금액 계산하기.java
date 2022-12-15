package codingTest;

public class Today20221215_3 {
    //Q. 부족한 금액 계산하기
    //이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
    //놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
    //단, 금액이 부족하지 않으면 0을 return 하세요.

    public static long solution(int price, int money, int count) {
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += (price * i);
        }

        return (money > sum ? 0 : sum-money);
    }
    public static void main(String[] args) {
        Today20221215_3.solution(3,20,4);
    }
}
