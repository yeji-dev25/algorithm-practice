package backjun.silver.map;

import java.util.*;

/*
문제: 1269
유형: 집합과 맵
핵심: 시간복잡도 유의 필요.
*/
public class B1269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<Integer> A = new HashSet<>();
        for(int i = 0; i < N; i++){
            A.add(sc.nextInt());
        }

        Set<Integer> B = new HashSet<>();
        for(int i = 0; i < M; i++){
            B.add(sc.nextInt());
        }

        int count = 0;

        Iterator<Integer> iteratorA = A.iterator();
        for(int i = 0; i < N; i++){
            if(!B.contains(iteratorA.next())) count++;
        }
        Iterator<Integer> iteratorB = B.iterator();
        for(int i = 0; i < M; i++){
            if(!A.contains(iteratorB.next())) count++;
        }
        System.out.println(count);
    }
}

// ❌ 틀린 이유1: Map으로 처음에 했다가 containsValue에서 시간초과가 뜸.
// Map은 key로 찾을때는 O(1)이지만, Value로 찾을때는 해시코드로 저장 되어있지 않아 O(N)이다

/* 더 깔끔한 코드.
set은 중복 제거하므로 입력 받은 수로 도는건 위험함.
또한, Iterator 쓸때는 for문 안쓰고 hasNext()로 제어하는게 좋음
int count = 0;

for (int a : A) {
    if (!B.contains(a)) count++;
}

for (int b : B) {
    if (!A.contains(b)) count++;
}

System.out.println(count);*/

