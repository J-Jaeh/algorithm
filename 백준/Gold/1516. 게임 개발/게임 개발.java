import java.util.*;

public class Main {
    /*
        그래프로 해야되는이유.?
        map을 이용한다면 너무 비효율적  -> DP
        map으로 하면 스탑지점을 알아야하는데 타고 들어갈
        그룹으로는 해결하기 힘듥..?

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Building[] buildings = new Building[N+1]; // 시간

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<N+1;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=1;i<N+1;i++){
            Building building = new Building();
            building.time = sc.nextInt();
            buildings[i] = building;
            while (true){
                int pre = sc.nextInt();
                if(pre == -1) break;
                //
                building.degree++;
                //그래프 연결 해줘야함 .. !
                graph.get(pre).add(i);// pre->i 연결
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i =1;i<N+1;i++){
            if(buildings[i].degree ==0){
                q.add(i);
                buildings[i].ct=buildings[i].time;
            }
        }

        while (!q.isEmpty()){
            Integer c = q.poll();

            //차수가 0인애들에 연결된 애들이 나옴
            for(int n : graph.get(c)){
                buildings[n].degree--;
//                System.out.println("n = "+n + " c = "+c);
//                System.out.println("b n c = "+buildings[n].ct +" " +buildings[c].ct +" "+ buildings[n].time);
                buildings[n].ct = Math.max(buildings[n].ct, buildings[c].ct + buildings[n].time);
//                System.out.println("--------");
                if(buildings[n].degree ==0){
                    q.add(n);
                }
            }
        }

        for (int i =1;i<N+1;i++) {
            System.out.println(buildings[i].ct);
        }



    }

   private static class Building{
        int time;
        int degree;
        int ct;
   }

}
