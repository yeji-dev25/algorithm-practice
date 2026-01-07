package backjun.silver.map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
문제: 10815
유형: 집합과 맵
핵심: 배열안에 존재하는지 확인
*/
public class B10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(sc.nextInt());
        }

        int M = sc.nextInt();
        int[] arrayFind = new int[M];
        for(int i = 0; i < M; i++){
            arrayFind[i] = sc.nextInt();
        }

        int[] answer = new int[M];
        for(int i = 0; i < M; i++){
            if(set.contains(arrayFind[i])) answer[i] = 1;
        }

        for(int i = 0; i < M; i++){
            System.out.print(answer[i] + " ");
        }
    }
}