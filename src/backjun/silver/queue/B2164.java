package backjun.silver.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

/*
문제: 2164
유형: 큐
핵심: 큐를 이용함
*/
public class B2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayDeque<Integer> array = new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            array.add(i+1);
        }
        while (array.size() > 1){
            array.poll();
            array.add(Objects.requireNonNull(array.poll()));
        }
        System.out.println(array.getFirst());
    }
}
