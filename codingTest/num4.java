package codingTest;

import java.util.HashMap;
import java.util.Map;

public class num4 {
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> run = new HashMap<>();

        String answer = "";

        for (String p : participant) {
            //map 추가 방법 : run.put(key이름, value);
            //getOrDefault(비교할 키, 키가 없다면 디폴트 값으로 입력)
            run.put(p, run.getOrDefault(p, 0)+1);
        }

        for (String c : completion) {
            //키의 값 불러오기 : run.get(키)
            //HashMap의 put은 key가 존재하면 value를 새로운 값으로 바꿔줌
            //완주자(c) 목록을 하나씩 읽으며 저장된 맵의 value를 1씩 감소
            run.put(c, run.get(c) - 1);
        }

        //run에 있는 전체 key 목록
        for (String key : run.keySet()){
            if (run.get(key) != 0){
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(num4.solution(participant,completion));
    }
}
