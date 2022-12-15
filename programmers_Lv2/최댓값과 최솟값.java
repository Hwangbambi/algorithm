package codingTest;

public class Today20221215_2 {
    //Q. 문자열 다루기 기본
    //문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
    //예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

    public static String solution(String s) {
        String[] s_split = s.split(" ");

        int max = Integer.parseInt(s_split[0]);
        int min = Integer.parseInt(s_split[0]);

        for (String s_int : s_split ) {
            if (Integer.parseInt(s_int) > max) {
                max = Integer.parseInt(s_int);
            }
            if (Integer.parseInt(s_int) < min) {
                min = Integer.parseInt(s_int);
            }
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        Today20221215_2.solution("-1 -2 -3 -4");
    }
}
