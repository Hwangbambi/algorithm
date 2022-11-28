package codingTest;

import java.util.Arrays;

public class num2 {
    public static int[] solution(int[] arr, int divisor) {
        int count = 0;
        int index = 0;

        //arr[] 배열에 담긴 값 중에 divisor로 나눴을 때 0으로 떨어지는 값의 갯수
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                count++;
            }
        }

        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                //arr[] 배열의 값 중에 0으로 떨어지는 값만 answer[] 배열에 저장
                answer[index] = arr[i];
                index++;
            }
        }

        //answer[] 오름차순으로 정렬
        Arrays.sort(answer);

        //answer[] 배열에 값이 없다면 -1 리턴
        if (answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        for (int a : answer) {
            System.out.println(a);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,7,8};
        int divisor = 2;

        num2.solution(arr,divisor);
    }
}
