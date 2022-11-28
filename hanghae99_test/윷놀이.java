package codingTest;

public class Main2 {
    public String solution(int[] arr1) {
        //도(배 1개, 등 3개), 개(배 2개, 등 2개), 걸(배 3개, 등 1개), 윷(배 4개), 모(등 4개)
        //배(0)와 등(1)
        //테스트 1번 문제

        int front = 0; //배(0)
        int back = 0; //등(1)

        for (int a : arr1) {
            if (a == 0) {
                //a가 배(0) 라면
                front++;
            } else {
                //a가 등(1) 이라면
                back++;
            }
        }

        String answer = "";

        if (front == 1 && back == 3){
            answer = "도";

        } else if (front == 2 && back == 2) {
            answer = "개";

        } else if (front == 3 && back == 1) {
            answer = "걸";

        } else if (front == 4 && back == 0) {
            answer = "윷";

        } else if (front == 0 && back == 4) {
            answer = "모";

        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 method = new Main2();
        int[] arr1 = {0,0,0,0}; //윷 리턴
        System.out.println(method.solution(arr1));
    }
}
