package backjun.silver.deck;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
문제: 28279
유형: 덱
핵심: 케이스에 맞게 잘 나누기
*/
public class B28279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            int k = sc.nextInt();
            Integer answer = 0;

            switch (k){
                case 1:
                    arrayDeque.addFirst(sc.nextInt());
                    break;
                case 2:
                    arrayDeque.addLast(sc.nextInt());
                    break;
                case 3:
                    answer = arrayDeque.pollFirst();
                    if(answer == null) answer = -1;
                    sb.append(answer).append("\n");
                    break;
                case 4:
                    answer = arrayDeque.pollLast();
                    if(answer == null) answer = -1;
                    sb.append(answer).append("\n");
                    break;
                case 5:
                    sb.append(arrayDeque.size()).append("\n");
                    break;
                case 6:
                    sb.append(arrayDeque.isEmpty() ? 1:0).append("\n");
                    break;
                case 7:
                    if(arrayDeque.isEmpty()){
                        answer = -1;
                    }else{
                        answer = arrayDeque.getFirst();
                    }
                    sb.append(answer).append("\n");
                    break;
                case 8:
                    if(arrayDeque.isEmpty()){
                        answer = -1;
                    }else{
                        answer = arrayDeque.getLast();
                    }
                    sb.append(answer).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}