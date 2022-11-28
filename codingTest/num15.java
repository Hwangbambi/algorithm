package codingTest;
import java.util.*;

public class num15 {
    public static int[] solution(int[] arr) {
        //HashMap<>은 중복값을 없애주지만, 배열 전체의 대해서 중복값을 제거하기때문에 원하는 [1,3,0,1] 이라는 답을 얻을수가 없었다. 게다가 입력한 순서대로 출력되는게 아님

        //arrayList 사용하는 이유 : 배열에 몇개의 요소가 제거해야 되는지 모르고 arrayList는 입력할 요소의 수를 알지 않아도 되므로
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        //arr 배열엔 0~9 까지의 원소가 들어가는데, 맨 처음 arrayList 에 요소 add 할 때 원소들과 겹치지 않는 수, 비교할 수 있는 수로 초기화 함
        // 추후 arrayList에 가장 최근에 넣은 값과 비교하여 값이 있다면 arrayList에 add 안되고 없다면 add 되도록 함
        int num = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num) {
                num = arr[i];
                arrList.add(num);
            }
        }

        //중복 수 제거 후 저장할 배열 선언
        int[] answer = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] num = {1,1,3,3,0,1,1};

        int[] answer = solution(num);

    }
}
