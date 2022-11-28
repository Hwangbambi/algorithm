package codingTest;

public class Main3 {
    public void solution(int star) {
        // 1 3 5 7 9 11 13 ... 한 줄씩 별 2개 증가
        //테스트 2번 문제

        String star_img = "*";

        for (int i = 0, j = star-1; i < star*2 || j > 0; i++, j--){
            star_img = " ".repeat(j) + "*".repeat(i+1);
            i++;
            System.out.println(star_img);
        }
    }

    public static void main(String[] args) {
        Main3 method = new Main3();
        int star = 9;
        method.solution(star);
    }
}
