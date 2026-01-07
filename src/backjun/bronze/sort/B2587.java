package backjun.bronze.sort;

import java.util.Arrays;
import java.util.Scanner;

/*
문제: 2587
유형: 정렬
핵심: 문제를 잘 읽고 정렬 함수를 잘 이용 해야함
*/
public class B2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.stream(array).sum()/5);
        System.out.println(array[2]);
    }
}

// ❌ 틀린 이유1: 너무 어렵게 생각함. 문제를 잘 읽자
