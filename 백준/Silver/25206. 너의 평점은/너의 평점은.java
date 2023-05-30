import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] score = new double[20];
        //음수로 가져가서 마지막에 빼면 되는거 아닌가 ?
        // 학점에서 빼고 ..하면 디는거 아님?
        double saveParent = 0;

        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();// 버리는 값
            // 전공평점은 (학점*과목평점)/학점의 합
            // 그니까 P인경우는 일단 더한 학점의 합에서 if P일경우
            //그냥 다 0으로해 ㅡㅡ
       double s = Float.parseFloat(st.nextToken());

       double gradeN =0;

       switch(st.nextToken()){
           case "A+": {
               gradeN = 4.5;
               break;
           }
           case "A0": {
               gradeN = 4.0;
               break;
           }
           case "B+": {
               gradeN = 3.5;
               break;
           }
           case "B0": {
               gradeN = 3.0;
               break;
           }
           case "C+": {
               gradeN = 2.5;
               break;
           }
           case "C0": {
               gradeN = 2.0;
               break;
           }
           case "D+": {
               gradeN = 1.5;
               break;}
           case "D0": {
               gradeN = 1.0;
               break;
           }
           case "F": {
               gradeN = 0.0;
               break;
           }
           case "P": {
               s = 0;
               break;
           }
       }

        double save=s *gradeN;
        saveParent+=s;
         score[i]=save;
        }
        double sum = Arrays.stream(score).sum();
        System.out.println(sum/saveParent);
    }
}
