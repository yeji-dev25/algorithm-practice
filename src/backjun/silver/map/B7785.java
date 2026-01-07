package backjun.silver.map;

import java.util.*;

/*
문제: 7785
유형: 집합과 맵
핵심: 출력을 사전순의 역순으로 해야 하는것이 핵심
*/
public class B7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            String name = sc.next();
            if(sc.next().equals("enter")) set.add(name);
            else set.remove(name);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Comparator.reverseOrder());
        Iterator iterator = list.iterator();

        for(int i = 0; i < list.size(); i++){
            System.out.println(iterator.next());
        }
    }
}

// ❌ 틀린 이유1: set은 순서가 없는 형태라 정렬이 안된다.
// ❌ 틀린 이유2: set이 안돼 list로 바꿨더니 시간초과가 떴다.
// list.remove의 형태가 중간에 하나를 지우면 뒤에 수들을 하나씩 앞당기는 자료구조이다.
// 이 자체로 O(n)의 시간복잡도가 생기므로 반복문을 중첩하면 O(n^2)이 되므로 시간초과가 뜬 것이였다.

// 해결법 => set과 list를 결합하는게 중요한 문제였다. 문제 풀이는 Set으로 하되, List로 변환한 뒤 정렬하여 출력하면 된다.
// 시간은 좀 늦어질지언정 TreeSet으로 푸는 방법도 존재한다.(TreeSet은 set이면서 정렬 가능)