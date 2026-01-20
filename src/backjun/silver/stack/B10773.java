package backjun.silver.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
문제: 10773
유형: 스택
핵심: 문제를 따라가면 됨
*/
public class B10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            if(a == 0) list.remove(list.size()-1);
            else list.add(a);
        }

        int answer = 0;
        for(int i = 0; i < list.size(); i++){
            answer+=list.get(i);
        }
        System.out.println(answer);
    }
}