package codingTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class num1 {
    public static String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // 월~일 : 1~7 숫자로 출력됨
        int dayOfWeekNumber = dayOfWeek.getValue();

        String answer = "";

        if(dayOfWeekNumber == 1) {
            answer = "MON";
        } else if(dayOfWeekNumber == 2) {
            answer = "TUE";
        } else if(dayOfWeekNumber == 3) {
            answer = "WED";
        } else if(dayOfWeekNumber == 4) {
            answer = "THU";
        } else if(dayOfWeekNumber == 5) {
            answer = "FRI";
        } else if(dayOfWeekNumber == 6) {
            answer = "SAT";
        } else {
            answer = "SUN";
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 25;

        System.out.println(num1.solution(a,b));
    }
}
