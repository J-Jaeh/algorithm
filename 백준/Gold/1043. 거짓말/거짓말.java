import java.util.*;

public class Main {
    static HashSet<Integer> knows;
    static int[] peoples;
    static void union(int a , int b){
        int findA = find(a);
        int findB = find(b);
        if(findA != findB){
            peoples[findB]=findA;
        }
    }

    static int find(int a){
        if (peoples[a]==a) return a;
        return peoples[a]=find(peoples[a]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 총 사람수
        int M = sc.nextInt(); // 파티수

        int know = sc.nextInt();

        knows=new HashSet<>();
        peoples=new int[N+1];

        for(int i=0;i<know;i++){
            knows.add(sc.nextInt());
        }

        for(int i=0;i<N+1;i++){
            peoples[i]=i;
        }

        List<List<Integer>> parties = new ArrayList<>();

        for(int i = 0 ; i<M;i++){
            List<Integer> party = new ArrayList<>();
            int partySize = sc.nextInt();

            for(int j=0;j<partySize;j++){
                party.add(sc.nextInt());
            }
            parties.add(party);

            for(int j=1;j<partySize;j++){
                union(party.get(0),party.get(j));
            }
        }
        Set<Integer> knowsIndex = new HashSet<>();
        for (Integer k : knows) {
//            System.out.println(find(k) + " " + k);
            knowsIndex.add(find(k));
        }

        int count =0;
        for (List<Integer> party : parties) {
            for (Integer q : party) {
                if(knowsIndex.contains(find(q))){
                    count++;
                    break;
                }
            }
        }

        System.out.println(M-count);
    }


}
