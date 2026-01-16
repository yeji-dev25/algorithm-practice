package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 1929
유형: 약수와 배수
핵심: 에라토스테네스의 체
*/
public class B1929 {

    static public boolean isPrime(int a){
        if (a == 2) return true;
        if (a == 1 || a % 2 == 0) return false;
        for(int i = 3; i * i <= a; i+=2){
            if(a % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

// ❌ 틀린 이유1: 에라토스테네스의 체가 뭐인지 몰랐음