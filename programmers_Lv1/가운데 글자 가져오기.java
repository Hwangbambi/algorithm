package codingTest;

public class Today221205 {
    //Q. 가운데 글자 가져오기
    //단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    public static String solution(String s) {
        int s_length = s.split("").length;

        String answer = "";
        int start_index = 0;

        if (s_length % 2 == 0){
            start_index = (s_length / 2) - 1;
            answer = s.substring(start_index,start_index+2);

        } else {
            start_index = ((s_length + 1) / 2) - 1;
            answer = s.substring(start_index,start_index+1);

        }
        return answer;
    }

    public static void main(String[] args) {
        Today221205.solution("abde");
    }
}
