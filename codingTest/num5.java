package codingTest;

public class num5 {
    public String solution(String s) {
        //"try hello world"	"TrY HeLlO WoRlD"
        //문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단

        //s = s.trim(); 문자열 앞 뒤로 공백이 있다면 공백 그대로 출력하고 문자만 대소문자로 변환해서 푸는 문제인 거 같음 그래서 공백 제거하면 오류 뜸
        String[] word = s.split("");
        String answer = "";

        int index = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals(" ")) {
                index = 0;

            } else if (index % 2 == 0){
                word[i] = word[i].toUpperCase();
                index++;

            } else if (index % 2 != 0){
                word[i] = word[i].toLowerCase();
                index++;

            }

            answer += word[i];
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String s = "  try hello  world  ";
        new num5().solution(s);

    }
}
