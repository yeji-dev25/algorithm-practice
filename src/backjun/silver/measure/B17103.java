package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 17103
유형: 약수와 배수
핵심: 에라토스테네스의 체 응용문제
*/
public class B17103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] nums = new int[T];
        int maxN = 0;
        for (int i = 0; i < T; i++) {
            nums[i] = sc.nextInt();
            maxN = Math.max(maxN, nums[i]);
        }

        boolean[] isPrime = new boolean[maxN + 1];

        // 처음엔 전부 소수라고 가정
        for (int i = 2; i <= maxN; i++) {
            isPrime[i] = true;
        }

        // 체
        for (int i = 2; i * i <= maxN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int n : nums) {
            int count = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (isPrime[i] && isPrime[n - i]) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}

// ❌ 틀린 이유1: 에라토스테네스의 체 방법을 잘 이해 못함. 이 문제 나중에 다시 풀어 볼 필요 있음.