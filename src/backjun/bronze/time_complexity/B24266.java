package backjun.bronze.time_complexity;

import java.util.Scanner;

/*
문제: 24266
유형: 시간복잡도
핵심: n^3 => long 타입
*/
public class B24266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        System.out.println(n*n*n);
        System.out.println(3);
    }
}
