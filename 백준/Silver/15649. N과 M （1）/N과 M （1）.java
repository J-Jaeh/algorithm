import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    //    첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
    public static void main(String[] args) {
        int N,M;
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        N=Integer.parseInt(s[0]);
        M=Integer.parseInt(s[1]);
        dfs(M,N,new ArrayList<>());
    }

    private static void dfs(int M , int N, List<Integer> input){
        if(input.size() == M){
            System.out.println(input
                            .stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(" "))
            );
            return;
        }
        for(int i=0;i<N;i++){
            if(!input.contains(i+1)) {
                input.add(i + 1);
                dfs(M, N, input);
                input.remove((Integer) (i + 1));
            }
        }
    }
}
