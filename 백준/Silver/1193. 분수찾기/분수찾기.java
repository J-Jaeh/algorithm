import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
       
        int up = 1;
        int down = 1;

        int count = 1;

        while (a>count){
         //지그재그
            // up이 1이면 down을 ++ 하고
            // 그게 아니라면 up을 ++ 하면 되네
            //일단 양끝에서 움직이는건 이렇게 하면되고
            if(up==1){
                down++;
                count++;
                int saveDown= down;
                while (a>count&&up!=saveDown){
                        up++;
                        down--;
                        count++;
                }
            }else{// 반대로 내려가는경우
                count++;
                up++;
                int saveUP=up;
                while (a>count&&down!=saveUP){
                    up--;
                    down++;
                    count++;
                }
            }
        }

        System.out.println(up+"/"+down);
    }
}
