package backjun.silver.queue;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
문제: 11866
유형: 큐
핵심: 큐를 이용함
*/
public class B11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for(int i = 0; i < N; i++){
            ad.add(i+1);
        }
        int i = 1;
        sb.append("<");
        while (ad.size() > 1){

            int a = ad.poll();
            if(i % k != 0) ad.add(a);
            else sb.append(a).append(", ");
            i++;
        }

        sb.append(ad.getFirst()).append(">");
        System.out.println(sb);
    }
}
