package codingTest;

public class num10 {
    public static int[] solution(int[] arr) {
        //arr 에서 가장 작은 수를 제거한 배열을 리턴
        //배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴

        //arr 내림차순 - int 타입 배열 오름차순은 바로 Arrays.sort() 써도 되지만
        // 오름차순은 Integer 배열로 boxing 을 꼭 해야 된다.
        //Integer[] arr_integer = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        //1. 하나의 값을 기준으로 잡음.
        int min = arr[0];

        for (int a : arr) {
            //a 와 min 값을 비교해서 더 작은 값이 리턴
            min = Math.min(a,min);

        }

        //2. arr 배열 길이가 1 이라면 -1 리턴
        if (arr.length < 2){
            int[] answer = {-1};
            return answer;

        }

        int index = 0;

        //3. 가장 작은 수를 제외하고 저장할 배열 선언
        int[] answer = new int[arr.length - 1];


        //break 를 만나면 즉시 해당 반복문 전체를 나간다.
        //continue를 만나면 해당 반복부분만 탈출하고 다음번 반복을 이어서한다.
        for (int a : arr) {
            if (a == min) {
                continue;
            }

            answer[index++] = a;

        }
        return answer;

    }

    public static void main(String[] args) {
        int[] arr = {5,6,9,3};
        int[] answer = solution(arr);

        for (int a : answer) {
            System.out.print(a);
        }

    }
}
