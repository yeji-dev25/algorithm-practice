package backjun.bronze.time_complexity;

import java.util.Scanner;

/*
문제: 24264
유형: 시간복잡도
핵심: 입력값이 500,000까지이다. 제곱하면 int 자료형을 넘으므로 long타입이 필요함
*/
public class b24264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        System.out.println(n*n);
        System.out.println(2);
    }
}

// ❌ 첫 접근: 관성적으로 int로 했다가 틀림
