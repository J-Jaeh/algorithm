import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        // 위치를 찾아가야함 !
        // 재귀로 해도 되고 while 돌려도 상관없을 듯

        System.out.println(recurCubic((int) Math.pow(2,N),r,c));

    }

    private static int recurCubic(int N, int r , int c){
        //종료조건
        if(N==0) return 0;

        int h = N/2;
//        System.out.println("h is " + h+ " " + r + " " + c);

        // 0
        if(r<h && c<h){
//            System.out.println(" go 0");
            return recurCubic(N/2,r,c);
        }
        //1
        if(r<h && c>=h){
//            System.out.println(" go 1");
            return h*h + recurCubic(N/2,r,c-h);
        }
        //2
        if(r>=h && c<h){
//            System.out.println(" go 2");
            return h*h*2 + recurCubic(N/2,r-h,c);
        }
        //3
        if(r>=h && c>=h){
//            System.out.println(" go 3");
            return h*h*3 + recurCubic(N/2,r-h,c-h);
        }
        return -1;
    }
}
