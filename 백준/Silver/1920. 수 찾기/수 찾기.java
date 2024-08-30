import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        arr.sort(Comparator.naturalOrder());
        List<Integer> search = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            search.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=0;i<K;i++){
            System.out.println(binarySearch(search.get(i),arr));
        }


    }
    private static int binarySearch(int a, List<Integer> arr){
        int s = 0;
        int e = arr.size()-1;
        while (s<=e){
            int m=(s+e)/2;
            int mV=arr.get(m);
            if(mV>a){
                e=m-1;
                continue;
            }else if(mV<a){
                s=m+1;
                continue;
            }
            return 1;
        }
        return 0;
    }
}
