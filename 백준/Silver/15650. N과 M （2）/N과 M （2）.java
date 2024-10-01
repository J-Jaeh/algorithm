import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        dfs(0,N,M,new ArrayList<>());

    }

    private static void dfs(int s, int N, int M, List<Integer> input){
        if(input.size() == M){
            System.out.println(input.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(" "))
            );
            return;
        }

        for(int i=s ; i<N;i++){
            input.add(i+1);
            dfs(i+1,N,M,input);
            input.remove((Integer)( i+1));
        }
    }

}
