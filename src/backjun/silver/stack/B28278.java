package backjun.silver.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
문제: 28278
유형: 스택
핵심: 스택 개념 이해 필요
*/
public class B28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        List<Integer> array = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < X; i++){

            int a = sc.nextInt();

            if(a == 1) array.add(sc.nextInt());
            else if (a == 2) {
                if(!array.isEmpty()) {
                    sb.append(array.get(array.size() - 1)).append("\n");
                    array.remove(array.size() - 1);
                }else{
                    sb.append(-1).append("\n");
                }
            } else if (a == 3) {
                sb.append(array.size()).append("\n");
            } else if (a == 4) {
                if(array.isEmpty()) sb.append(1);
                else sb.append(0);
                sb.append("\n");
            }else if(a == 5){
                if(!array.isEmpty()) sb.append(array.get(array.size()-1));
                else sb.append(-1);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}

// ❌ 틀린 이유1: 스택의 개념을 생각 안하고 문제가 시킨대로만 하려고함.