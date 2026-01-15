package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 4134
유형: 약수와 배수
핵심: 소수 판별 코드
*/
public class B4134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] array = new long[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }

        long[] array2 = new long[N-1];
        for(int i = 0; i < N-1; i++){
            array2[i] = array[i+1] - array[i];
        }

        for(int i = 0; i < array2.length-1; i++) {
            long min = array2[i];
            long max = array2[i+1];
            while(min != 0){
                long r = max % min;
                max = min;
                min = r;
            }
            array2[i+1] = max;
        }

        long G = array2[array2.length - 1];
        long count = 0;

        for (int i = 0; i < N - 1; i++) {
            long d = array[i + 1] - array[i];
            count += (d / G) - 1;
        }

        System.out.println(count);
    }
}

// ❌ 틀린 이유1: 소수 판별 공식을 이해 못함.
// ❌ 틀린 이유2: 한번에 모든 수를 계산하려고 해서 시간초과가 뜸