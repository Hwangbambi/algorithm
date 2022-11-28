package codingTest;

public class num3 {
    public static String solution(int n) {

        String str1 = "수";
        String str2 = "박";
        String answer = "";

        if (n%2 == 0){
            answer = (str1 + str2).repeat(n/2);

        } else {
            answer = (str1 + str2).repeat(n/2) + str1;

        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(num3.solution(n));
    }
}
