package codingTest;

public class num13 {
    public int solution(int n) {
        //n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return
        //ex) n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
        //      45	       1200	        0021	        7
        //      125	       11122	    22111	        229

        //10진법 -> 3진법 변환
        String[] n3 = Integer.toString(n,3).split("");

        //앞뒤 반전 3진법
        String n3_re = "";

        for (int i = n3.length-1; i >= 0; i--){
            n3_re += n3[i];

        }

        //다시 10진법으로 변환
        int n10 = Integer.parseInt(n3_re,3);

        return n10;
    }

    public static void main(String[] args) {
        int n = 125;
        new num13().solution(n);

    }
}
