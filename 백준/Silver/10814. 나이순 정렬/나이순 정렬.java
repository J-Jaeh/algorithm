import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        PriorityQueue<Member> pq = new PriorityQueue<>((a,b)->a.age==b.age?Integer.compare(a.index,b.index):Integer.compare(a.age,b.age));
        for(int i =0;i<tc;i++){
            String[] an = br.readLine().split(" ");
            int age = Integer.parseInt(an[0]);
            String name = an[1];
            pq.add(new Member(age,name,i));
        }
        
        while (!pq.isEmpty()){
            Member poll = pq.poll();
            System.out.println(poll.age+" "+poll.name);
        }
    }

    private static class Member{
        int age;
        String name;
        int index;

        Member(int age,String name,int index){
            this.age=age;
            this.name=name;
            this.index=index;
        }
    }
}
