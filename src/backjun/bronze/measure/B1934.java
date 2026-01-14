package backjun.bronze.measure;

import java.util.Scanner;

/*
문제: 1934
유형: 약수와 배수
핵심: 유클리드 호제법!!!(최대공약수 구하기)
*/
public class B1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = Math.max(a, b);
            int min = Math.min(a, b);
            while (min != 0){
                int r = max % min;
                max = min;
                min = r;
            }
            sb.append(a*b/max).append("\n");
        }
        System.out.println(sb);

    }
}

// ❌ 틀린 이유1: 최대공약수 구하는 유클리드호제법의 개념을 전혀 몰랐다.
