package backjun.silver.map;

import java.util.*;

/*
문제: 11478
유형: 집합과 맵
핵심: 입력 받는 수를 어떻게 나누는지가 핵심
*/
public class B11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        Set<String> set = new HashSet<>();

        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < S.length() - i; j++){
                set.add(S.substring(j, j+i+1));
            }
        }
        System.out.println(set.size());
    }
}

// ❌ 틀린 이유1: S.substring(j, j+i+1) 이부분에 endIndex에 +1 안했다.