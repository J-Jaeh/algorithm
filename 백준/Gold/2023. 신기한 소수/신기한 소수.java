

import java.util.Scanner;

public class Main{
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);

    }
    
    static void DFS(int number, int len){
        if(len==N){
            if(isPrime(number)){
                System.out.println(number);
                return;
            }
        }
        for(int i =1 ;i<=10;i+=2){
            int temp = number*10+i;
            if(isPrime(temp)){
                DFS(temp,len+1);
            }
        }
    }
    
    static boolean isPrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i ==0) return  false;
        }
        return true;
    }
}
