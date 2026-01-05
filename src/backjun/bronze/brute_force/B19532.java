package backjun.bronze.brute_force;

import java.util.Scanner;

/*
문제: 19532
유형: 브루트포스
핵심: 범위를 보고, 브루트포스 가능한 문제라는걸 이해할 필요 있음
*/
public class B19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long e = sc.nextInt();
        long f = sc.nextInt();

        for(int x = -999; x < 1000; x++){
            for(int y = -999; y < 1000; y++){
                if(a*x + b*y == c && d*x + e*y == f){
                    System.out.print(x + " " + y);
                    break;
                }
            }
        }
    }
}

// ❌ 틀린 이유1: 연립방정식인줄 알고 문제를 어렵게 풀려고만 함
