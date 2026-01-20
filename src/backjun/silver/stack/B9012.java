package backjun.silver.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
문제: 9012
유형: 스택
핵심: '('가 없을떄 ')'가 먼저 나오면 break 해야함
*/
public class B9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<String> array = new ArrayList<>();
        for(int i = 0; i < N; i++){
            array.add(sc.next());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){

            int count = 0;
            boolean b = true;
            for(int j = 0; j < array.get(i).length(); j++){
                if(count == 0 && array.get(i).charAt(j) == ')') {
                    b = false;
                    break;
                }
                else if(array.get(i).charAt(j) == '(') count++;
                else count--;
            }
            if(b && count == 0) sb.append("YES");
            else sb.append("NO");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}