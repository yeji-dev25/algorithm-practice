package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 1735
유형: 약수와 배수
핵심: 최대공약수를 구해서 나눠주기
*/
public class B1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long A = a*d + b*c;
        long B = b*d;

        long max = Math.max(A,B);
        long min = Math.min(A,B);
        while (min != 0){
            long r = max % min;
            max = min;
            min = r;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(A / max).append(" ").append(B / max);
        System.out.println(sb);
    }
}