package backjun.silver.measure;

import java.util.Scanner;

/*
문제: 13909
유형: 약수와 배수
핵심: 완전제곱수 특징 이해
*/
public class A13909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int answer = (int)Math.sqrt(N);
        System.out.println(answer);
    }
}


/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean[] array = new boolean[N];
        for(int i = 0; i < N; i++){
            array[i] = false;
        }

        for(int i = 1; i <= N; i++){
            for(int j = i; j <= N; j+=i){
                array[j-1] = !array[j - 1];
            }
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            if(array[i]) count++;
        }

        System.out.println(count);
    }
}*/
// ❌ 틀린 이유1: 배열이 필요 없는 문제를 구분하지 못해 메모리 초과가 뜸.
// 이 문제는 겹치는 약수가 하나인, 즉 완전 제곱수를 카운트 하는 문제였다.

