package backjun.silver.map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
문제: 14425
유형: 집합과 맵
핵심: 배열안에 존재하는지 확인
*/
public class B14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(sc.next());
        }

        int count = 0;
        for(int i = 0; i < M; i++){
            if(set.contains(sc.next())) count ++;
        }

        System.out.println(count);
    }
}