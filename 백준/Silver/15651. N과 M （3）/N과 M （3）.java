import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        dfs(N,M,new ArrayList<>());
        System.out.println(sb.toString());

    }

    private static void dfs(int N , int M , List<Integer> input){
        if(input.size() == M){
            sb.append(input
                    .stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
            sb.append("\n");
            return;
        }

        for(int i=0;i<N;i++){
            input.add(i+1);
            dfs(N,M,input);
            input.remove((input.size()-1));
        }
    }
}
