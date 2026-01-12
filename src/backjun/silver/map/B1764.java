package backjun.silver.map;

import java.util.*;

/*
문제: 1764
유형: 집합과 맵
핵심: 중복으로 입력 받은 문자 출력, 입력은 set으로 정렬은 list로.
*/
public class B1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(sc.next());
        }

        List<String> answer = new ArrayList<>();
        for(int i = 0; i < M; i++){
            String a = sc.next();
            if(set.contains(a)) answer.add(a);
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}