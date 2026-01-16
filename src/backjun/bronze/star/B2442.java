package backjun.bronze.star;

import java.util.Arrays;
import java.util.Scanner;

/*
문제: 2442
유형: 반복문
핵심: 별 찍기
*/
public class B2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 2*N-1; i+=2){
            for(int j = 0; j < (2*N-1-i)/2; j++){
                sb.append(" ");
            }
            for(int j = 0; j < i; j++){
                sb.append("*");
            }
            sb.append("\n");
            /*String s = " ".repeat((2*N-1-i)/2);
            String s2 = "*".repeat(i);
            sb.append(s).append(s2).append("\n");*/
        }
        System.out.println(sb);
    }
}

// ❌ 틀린 이유1: 뒤에 공백은 굳이 찍을 필요 없음.
// 공백은 문자로 만들지말고, 그냥 없는 상태로 두자.
