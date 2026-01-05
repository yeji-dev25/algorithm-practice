package backjun.silver.brute_force;

import java.util.Scanner;

/*
문제: 1018
유형: 브루트포스
핵심: 기준을 나눠, 하나씩 비교한다.
*/
public class B1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();
        String[] array = new String[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextLine();
        }

        int answer = 64;
        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){

                int countW = 0;
                int countB = 0;
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char current = array[i + x].charAt(j + y);
                        if ((x + y) % 2 == 0) {
                            // 짝수 칸
                            if (current != 'W') countW++;
                            if (current != 'B') countB++;
                        } else {
                            // 홀수 칸
                            if (current != 'B') countW++;
                            if (current != 'W') countB++;
                        }
                    }
                }
                int localMin = Math.min(countW, countB);
                answer = Math.min(answer, localMin);
            }
        }
        System.out.println(answer);
    }
}

// ❌ 틀린 이유1: 가장 처음 오는 문자에따라 기준이 바뀐다는걸 잘 이해 못함
// ❌ 틀린 이유2: 처음 좌표가 바뀌는걸 표현하는 방법을 찾지 못함
// ❌ 틀린 이유3: "(i+j) % 2"로 홀수/짝수를 나눠 비교한다는 발상을 생각 못함
