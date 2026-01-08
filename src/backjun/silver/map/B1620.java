package backjun.silver.map;

import java.util.*;

/*
문제: 1620
유형: 집합과 맵
핵심: 입력받는 수의 타입 확인필요, List 형식은 indexOf에서 O(n)이라 시간초과 뜸
양방향 조회는 리스트와, 맵으로 나누는게 최적.
*/
public class B1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<String> dic = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            String s = sc.next();
            dic.add(s);
            map.put(s, i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            if(sc.hasNextInt()){
                sb.append(dic.get(sc.nextInt()-1) + "\n");
            }else{
                sb.append((map.get(sc.next()) + 1) + "\n");
            }
        }
        System.out.println(sb);
    }
}

// ❌ 틀린 이유1: 처음엔 List로 다 계산하려다가 indexOf에서 시간초과가 떴다.
// HashMap으로 양방향 조회 해서 시간 초과 조심하자.
