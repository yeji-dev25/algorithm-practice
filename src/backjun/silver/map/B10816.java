package backjun.silver.map;

import java.util.*;

/*
문제: 10816
유형: 집합과 맵
핵심: 시간복잡도 생각하는게 핵심
*/
public class B10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            sb.append(map.getOrDefault(sc.nextInt(), 0)).append(" ");
        }
        System.out.println(sb);
    }
}

// ❌ 틀린 이유1: 간단하게 List의 frequency로 빈도 수 구했다가 시간초과가 걸림
// frequency 함수는 전체 돌려야 하므로 O(n)이다. 이걸 for문으로 할경우 O(n^2)이 되므로
// 맵으로 찾아서 빈도수 올려주는 방법을 사용함.