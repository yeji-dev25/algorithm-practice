package backjun.bronze.time_complexity;

import java.util.Scanner;

/*
문제: 24265
유형: 시간복잡도
핵심: n보다 1 작은 수를 순차적으로 더해야함
*/
public class B24265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += i;
        }

        System.out.println(sum);
        System.out.println(2);
    }
}
