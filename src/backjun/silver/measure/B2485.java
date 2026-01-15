package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 2485
유형: 약수와 배수
핵심: 여러수의 최대공약수 구하기.
*/
public class B2485 {
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

// ❌ 틀린 이유1: 계산법을 이해 못함.

// 모범 답안
/*
import java.util.*;

public class Main {

    static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. 첫 간격으로 GCD 초기화
        long g = arr[1] - arr[0];

        // 2. 나머지 간격들과 GCD 누적
        for (int i = 2; i < N; i++) {
            g = gcd(g, arr[i] - arr[i - 1]);
        }

        // 3. 추가 가로수 개수 계산
        long count = 0;
        for (int i = 1; i < N; i++) {
            count += (arr[i] - arr[i - 1]) / g - 1;
        }

        System.out.println(count);
    }
}
*/

