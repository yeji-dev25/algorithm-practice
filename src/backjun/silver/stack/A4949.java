package backjun.silver.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
문제: 4949
유형: 스택
핵심: push, pop 이해 필요
*/
public class A4949 {
    static StringBuilder sb = new StringBuilder();

    public static void roof(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    sb.append("no\n");
                    return;
                }
                stack.pop();
            }
            else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    sb.append("no\n");
                    return;
                }
                stack.pop();
            }
        }
        sb.append(stack.isEmpty() ? "yes\n" : "no\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals(".")) break;
            roof(line);
        }

        System.out.print(sb);
    }
}
// ❌ 틀린 이유1: 로직을 복잡하게 짜서 내가 그 로직을 헷갈려 함.