package codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class num14 {
    public static int solution(int[][] sizes) {
        //모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return

        int w = 0;
        int h = 0;
        int resize;

        System.out.println(sizes.length);//4ㅡ

        //가로보다 세로가 더 길면 두 인덱스 값 바꿈
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]){
                //가로 값 저장
                resize = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = resize;

            }

            if (w < sizes[i][0]) {
                w = sizes[i][0];

            }

            if (h < sizes[i][1]) {
                h = sizes[i][1];

            }

        }

        //2차 배열 모두 출력
        //System.out.println(Arrays.deepToString(sizes));

        int answer = w * h;

        return answer;
    }


    public static void main(String[] args) {
        int[][] num = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        //가로 80 세로 50 인 값을 리턴
        int answer = solution(num);

    }
}
