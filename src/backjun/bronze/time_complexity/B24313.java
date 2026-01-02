package backjun.bronze.time_complexity;

import java.util.Scanner;

/*
문제: 24267
유형: 점근적 표기
핵심: 알고리즘 해석 필요, 기울기 이해 필요
*/
public class B24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextInt();
        long a0 = sc.nextInt();
        long c = sc.nextInt();
        long n0 = sc.nextInt();

        int answer = 0;
        if(a1 <= c && a1 * n0 + a0 <= c*n0) answer = 1;

        System.out.println(answer);
    }
}

// ❌ 틀린 이유1: 스캐너는 한번만 쓰고 nextInt로 가져가야 하는데 스캐너를 여러번 사용함
// ❌ 틀린 이유2: f(n)의 기울기가 더 커지면 언젠간 g(n)보다 큰 수가 나오므로
// f(n) < c*g(n)의 조건을 맞출려면 g(n)의 기울기가 더 커야함