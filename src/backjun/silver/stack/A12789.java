package backjun.silver.stack;

import java.util.Scanner;
import java.util.Stack;

/*
문제: 12789
유형: 스택
핵심: 문제 이해 필요
*/
public class A12789 {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        int count = 1; // 현재 와야 하는 숫자
        int i = 0; // 배열 인덱스
        while (true) {
            if (count == N + 1) {
                System.out.println("Nice");
                break;
            }
            // 배열 다 썼는데 더 이상 꺼낼 수 없을 때
            if (i >= N && (stack.isEmpty() || stack.peek() != count)) {
                System.out.println("Sad");
                break;
            }
            if (!stack.isEmpty() && stack.peek() == count) {
                stack.pop();
                count++;
            } else if (i < N && array[i] == count) {
                i++;
                count++;
            } else {
                stack.push(array[i]);
                i++;
            }

        }

    }
}

// ❌ 틀린 이유1: 안정성 체크 부족함
/* 모범 답안
while (i < N) {
    if (array[i] == count) {
        count++;
        i++;
    } else if (!stack.isEmpty() && stack.peek() == count) {
        stack.pop();
        count++;
    } else {
        stack.push(array[i]);
        i++;
    }
}

while (!stack.isEmpty()) {
    if (stack.pop() != count++) {
        System.out.println("Sad");
        return;
    }
}

System.out.println("Nice");
*/