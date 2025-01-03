import java.util.Scanner;

/*
    유니온 파인드 연습문제
    유니온 파인드란 ? 특정노드를 묶는 유니온과 같은 집합에 속해있는지 찾는 파인드 연산 ..
    흠.. !
 */
public class Main {
    static int[] parent;

    static int find(int a) {
        if (parent[a] == a) return parent[a];
        parent[a] = find(parent[a]);
//        System.out.println("parent[a] = " + parent[a]);
        return parent[a];
    }

    static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);

        // 다를 경우만 함침
        if (findA != findB) {
            parent[findB] = findA;
//            System.out.println("NO");
        }
    }

    static boolean check(int a, int b) {
        if (find(a) == find(b)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }
        //
        for (int i = 0; i < m; i++) {
            int op = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (op == 1) {
                if (check(a, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                union(a, b);
            }
        }
    }

}
