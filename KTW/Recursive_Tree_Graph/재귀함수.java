import java.util.*;

class Main{
    public void DFS(int n){
        if(n==0)return;
        else {
            System.out.println(n); //이러면  3 - 2 - 1 순 출력
            DFS(n -);
            System.out.println(n); // 이러면 1 - 2 - 3 순 출력 ~  왜? 함수 호출은 스택프레임(매개변수 지역변수 .. 복귀주소등 저장..)을 사용하기 때문에 !!
                // 손으로 그림그리면서 생각햅보셈 ~.~
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }

}