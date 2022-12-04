package codingTest;

public class Today221204_3 {
    //Q. x만큼 간격이 있는 n개의 숫자
    //정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴
    //x는 -10000000 이상, 10000000 이하인 정수입니다.
    //n은 1000 이하인 자연수입니다.

    public static long[] solution(long x, int n) {
        //x 변수를 long 타입으로 선언한 이유는, x 변수값을 최대값인 10000000 으로 넣으면
        //int 범위의 넘어버려서 - 로 처리되어 값이 다르게 나옴

        long[] answer = new long[n];

        for (int i = 0; i < answer.length; i++){
            answer[i] = x * (i+1);
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        long x = 10000000;
        int n = 1000;
        Today221204_3.solution(x, n);
    }

}
