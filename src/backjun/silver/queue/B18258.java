package backjun.silver.queue;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
문제: 18358
유형: 큐
핵심: 큐의 기본 문법을 상황에 맞게 작성
*/
public class B18258 {
    public static ArrayDeque<Integer> array = new ArrayDeque<>();
    public static StringBuilder sb = new StringBuilder();

    public static void push(int a){
        array.add(a);
    }

    public static void pop(){

        if(array.isEmpty()) {
            sb.append(-1).append("\n");
            return;
        }
        sb.append(array.poll()).append("\n");
    }

    public static void size(){
        sb.append(array.size()).append("\n");
    }

    public static void empty(){
        sb.append(array.isEmpty() ? 1:0).append("\n");
    }

    public static void front(){

        if(array.isEmpty()) sb.append(-1).append("\n");
        else sb.append(array.getFirst()).append("\n");
    }

    public static void back(){
        if(array.isEmpty()) sb.append(-1).append("\n");
        else sb.append(array.getLast()).append("\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            String s = sc.next();
            if(s.equals("push")) push(sc.nextInt());
            else if (s.equals("pop")) pop();
            else if (s.equals("size")) size();
            else if (s.equals("empty")) empty();
            else if (s.equals("front")) front();
            else if (s.equals("back")) back();
        }
        System.out.println(sb);
    }
}
// ❌ 틀린 이유1: System.out.println()을 남발해서 시간초과가 뜸.
// 출력이 많을 경우에는 반드시 String Build를 사용할것