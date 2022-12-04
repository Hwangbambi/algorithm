package codingTest;

public class Today221204_7 {
    //Q. 핸드폰 번호 가리기
    //전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
    //ex) "01033334444" -> "*******4444"

    public static String solution(String phone_number) {

        String[] phone_number_split = phone_number.split("");
        String answer = "";

        for (int i = 0; i < phone_number_split.length; i++) {
            if (i < phone_number_split.length - 4) {
                answer += "*";
            } else {
                answer += phone_number_split[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Today221204_7.solution("01033334444");
    }
}
