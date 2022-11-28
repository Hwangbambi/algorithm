package codingTest;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;

public class Main {
    public String solution(int month, int day) {
        //입력받은 날짜에서 98일 뒤인 날짜 리턴하기
        //모의고사 1번 문제

        DateFormat df = new SimpleDateFormat("MM-dd");
        String answer = "";

        try {
            //날짜 형식
            Date date = df.parse(month + "-" + day);

            Calendar cal = Calendar.getInstance();
            cal.setTime(date);

            //입력 받은 날짜에 +98
            cal.add(Calendar.DATE, 98);

            //-을 기준으로 나눈 후 배열에 저장 (month, day로 나누기)
            String[] date_array = df.format(cal.getTime()).split("-");

            //month가 한자릿수라면 0 제외 ex)04 -> 4
            if (Integer.parseInt(date_array[0]) < 10) {
                date_array = df.format(cal.getTime()).replaceAll("0","").split("-");
            }

            date_array[0] = date_array[0] + "월";
            date_array[1] = " " + date_array[1] + "일";

            for (String d : date_array) {
                answer += d;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(1, 18));
    }
}
