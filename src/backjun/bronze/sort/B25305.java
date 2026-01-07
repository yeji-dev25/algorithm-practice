package backjun.bronze.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
문제: 25305
유형: 정렬
핵심: 역정렬을 익혀야함
*/
public class B25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        Integer[] array = new Integer[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(array[k-1]);
    }
}