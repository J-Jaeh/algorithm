import java.until.*;
// 정렬을 이용하면 쉽게 풀리는 문제들을 생각해보자 ..!

class Main{
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp=arr.clone(); // 깊은복사.. 즉 참조가 아닌 진짜 하나 더 만들기
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if(arr[i]!=tmp[i]) answer.add(i + 1);
        }
        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(n.arr)) System.out.print(x+" ");
    }
}