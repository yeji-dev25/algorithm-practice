package backjun.bronze.time_complexity;

import java.util.Scanner;

/*
문제: 24267
유형: 시간복잡도
핵심: 시간복잡도 생각하여 더하기
*/
public class B24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long sum = 0;
        for(long i = n-2; i > 0; i--){
            sum += (i*(i+1))/2;
        }

        System.out.println(sum);
        System.out.println(3);
    }
}

// ❌ 틀린 이유1: 이중 for문으로 더하니 시간초과가 뜸
// ❌ 틀린 이유2: 처음에 i를 int 형으로 했더니 "sum += (i*(i+1))/2;" 이부분에서 틀림. 산술연산은 대입전에 끝난다.
// sum이 long 형이더라도 int * int = int로 이미 끝난 상태에서 long 자료형에 넣더라도 이미 int로 끝난 식이라 오버플로우가 발생함