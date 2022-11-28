package codingTest;

public class Main4 {
    public void solution(int[][] arr1) {
        //설명은 노션 참고하기
        //테스트 3번 문제

        String[][] answer = new String[5][5];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int[] up = {i-1, j};
                int[] down = {i+1, j};
                int[] left = {i, j-1};
                int[] rigth = {i, j+1};

                //가장자리
                //맨 위
                if (i == 0) {
                    up[0] = i;
                }
                //맨 아래
                if (i == arr1.length-1) {
                    down[0] = i;
                }
                //맨 왼쪽
                if (j == 0) {
                    left[1] = j;
                }
                //맨 오른쪽
                if (j == arr1[i].length-1) {
                    rigth[1] = j;
                }

                if (arr1[i][j] == Math.max(Math.max(Math.max(Math.max(arr1[i][j], arr1[up[0]][up[1]]), arr1[down[0]][down[1]]), arr1[left[0]][left[1]]), arr1[rigth[0]][rigth[1]])){
                    answer[i][j] = "*";
                } else {
                    answer[i][j] = Integer.toString(arr1[i][j]);

                }

            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (j < 4) {
                    System.out.print(answer[i][j] + " ");
                } else if (j == 4) {
                    System.out.println(answer[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Main4 method = new Main4();
        int[][] arr1 = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};

        method.solution(arr1);
    }
}
