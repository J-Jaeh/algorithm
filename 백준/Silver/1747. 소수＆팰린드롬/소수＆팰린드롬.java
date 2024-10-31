import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //투포인터 + 애라체 ~ ok ... N이 1000000보다 클수있음 그럼 어 수의 제한을 모르자나..
        // 수는 무한하니까 근데 최솟값이니 구할 수 있지

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 1000001 이거 소수인지 판별만 된다면 oK
        // 첫번째로 나오는 소수 + 펠린은 1003001
        int[] prime = new int[1003002];
        prime[0]=1;
        prime[1]=1;
        for(int i =2 ; i<= Math.sqrt(prime.length);i++){
            if(prime[i]==1) continue;
            int start = i+i;
            for(;start< prime.length;start+=i){
                prime[start] = 1;
            }
        }
        for(int i =N;i< prime.length;i++) {
            if (prime[i] == 0 && checkPell(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean checkPell(int input){

        char[] array = String.valueOf(input).toCharArray();
        int lp=0;
        int rp= array.length-1;

        while (lp<=rp){
            if (array[lp] == array[rp]){
                lp++;
                rp--;
            }else return  false;
        }
        return true;
    }
}
