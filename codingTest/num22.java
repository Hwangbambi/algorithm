package codingTest;

public class num22 {
    public int solution(String s) {
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        int answer = 0;

        //s변수는 String 타입 변수 이므로 int 타입인 i를 String 타입으로 형변환 후 넣어야 한다
        for (int i = 0; i < num.length; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        new num22().solution(s);

    }
}
