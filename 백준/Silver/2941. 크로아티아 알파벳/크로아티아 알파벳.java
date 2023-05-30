import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 일단 길이를 카운트하고
        // if c= c- d- lj nj s= z= 가 포함? -1
        // if dz= -2
        //하면 되는거 아님?
        //중복된걸 걸러야함 ;; 이건 while 지옥에나 빠져라 ,,,

        String input = br.readLine();

        int length = input.length();

        while (input.contains("c=")){
            length -=1;
           input = input.replaceFirst("c="," ");
        }
        while (input.contains("c-")){
            length -=1;
            input = input.replaceFirst("c-"," ");
        }
        while (input.contains("d-")){
            length -=1;
            input = input.replaceFirst("d-"," ");
        }
        while (input.contains("lj")){
            length -=1;
            input = input.replaceFirst("lj"," ");
        }
        while (input.contains("nj")){
            length -=1;
            input = input.replaceFirst("nj"," ");
        }
        while (input.contains("s=")){
            length -=1;
            input = input.replaceFirst("s="," ");
        }

        while (input.contains("dz=")){
            length -=2;
            input = input.replaceFirst("dz="," ");
        }

        while (input.contains("z=")){
            length -=1;
            input = input.replaceFirst("z="," ");
        }

        System.out.println(length);
    }
}
