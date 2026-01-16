package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 4948
유형: 약수와 배수
핵심: 소수판별 문제
*/
public class B4948 {

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

        while (true){

            int N = sc.nextInt();
            if(N == 0) break;
            int count = 0;
            for(int i = N+1; i <= 2*N; i++){
                if(isPrime(i)) count++;
            }
            System.out.println(count);
        }
    }
}

// ❌ 틀린 이유1: 에라토스테네스의 체가 뭐인지 몰랐음