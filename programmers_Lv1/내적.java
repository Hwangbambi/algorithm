package codingTest;

public class Today221205_2 {
    //Q. 가운데 글자 가져오기
    //길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
    //내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        Today221205_2.solution(a,b);
    }
}
