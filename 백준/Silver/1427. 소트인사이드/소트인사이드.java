import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
        //일단 10단위로 잘라서 배열을 만든뒤에 거기서 선택정렬 연습
        //vs
        //10단위로 자르면서 배열추가될때마다 자리 조정./..음..
        //이거말고도 그냥 subString해도 됨.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLen = str.length();
        int[] A = new int[strLen];
        for (int i =0;i<strLen;i++){
            A[i] = Integer.parseInt(str.substring(i,i+1));// 기억하면 편하긴할듯?
        }
        for(int i =0;i<strLen;i++){
            int Max = i;
            for(int j =i+1;j<strLen;j++){
                if(A[j]>A[Max]){
                    Max=j;
                }
            }
            if(A[i]<A[Max]){
                int tem = A[i];
                A[i]=A[Max];
                A[Max]=tem;
            }
        }
        for(int i=0;i<strLen;i++){
            System.out.print(A[i]);
        }
    }

}
