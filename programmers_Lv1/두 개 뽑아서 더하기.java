package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class num16 {
    public int[] solution(int[] numbers) {
        //[2,1,3,4,1] -> [2,3,4,5,6,7]
        //[5,0,2,7] -> [2,5,7,9,12]

        //numbers 배열의 중복 값 삭제
        //int[] numbers_stream = Arrays.stream(numbers).distinct().toArray();
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    numList.add(numbers[i] + numbers[j]);
                }
            }
        }

        //중복 수 제거
        HashSet<Integer> hashSet = new HashSet<>();
        for (int nl : numList){
            hashSet.add(nl);

        }

        //중복 수 제거 후 저장할 배열 선언
        int[] answer = new int[hashSet.size()];
        int index = 0;

        for (int hs : hashSet){
            answer[index] = hs;
            index++;

        }
        //HashSet에는 정렬 기능이 없음 !!!
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        new num16().solution(numbers);

    }
}
