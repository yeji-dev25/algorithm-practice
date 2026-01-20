package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 4134
유형: 약수와 배수
핵심: 소수 판별 코드
*/
public class A4134 {

    // 소수 판별 함수
    static boolean isPrime(long x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;

        // 합성수라면 제곱 이하에서 소수가 판별난다.
        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] array = new long[N];

        for(int i = 0; i < N; i++){
            array[i] = sc.nextLong();
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            while(!isPrime(array[i])){
                array[i]++;
            }
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb);
    }
}

// ❌ 틀린 이유1: 소수 판별 공식을 이해 못함.
// ❌ 틀린 이유2: 한번에 모든 수를 계산하려고 해서 시간초과가 뜸