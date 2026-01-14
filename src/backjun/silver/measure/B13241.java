package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 13241
유형: 약수와 배수
핵심: 유클리드 호제법(최대공약수 구하기)
*/
public class B13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();

        long max = Math.max(A, B);
        long min = Math.min(A, B);

        while (min != 0){
            long r = max % min;
            max = min;
            min = r;
        }
        System.out.println(A*B/max);
    }
}

// ❌ 틀린 이유1: int 자료형 사용했다가 틀림.
// 알고리즘은 무조건 long 타입으로 쓰는것으로 습관 만들자.
