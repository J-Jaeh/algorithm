import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] argus) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//아 어떻게 해야할까 ..? 간단하게 생각해보면... 9랑 6만 서로 상호 호환이 된다고 생각하면 되자나 ~
        //그럼 6과 9의 갯수를 체크하다음 숫자 + (6+9)/2 하면 되겠네 ? 6히나 9 3개이면
        //아 근데 숫자의 갯수가 필요한게 아니라 0~9까지 세트가 있는데 그 세트가 몇개가 필요하냐..~~`.. 이말임!
        //맵으로 쓴다 해봐 ~
        // 키값은 0~9까지 있어
        // 각자 카운트 시켜
        // 그리고 최댓값을 찾고
        // 최댓값이 6 or 9라면
        // 큰값이 이 작은값한테 줘 언제까지 ? 자기 같거나 ~ 값보다 커질때까지 ~
        //그리고 나서 다시 맥스값을 적용하면 되지 않을까 ?
        String input = br.readLine();
        Main main = new Main();
        System.out.println(main.solution(input));
    }

    private int solution(String input) {
        int maxV = Integer.MIN_VALUE;
        char maxK = 'a';
        char[] a = input.toCharArray();
        Map<Character, Integer> save = new HashMap<>();
        for (char key : a) {
            save.put(key, save.getOrDefault(key, 0) + 1);
        }
        for (Character character : save.keySet()) {
            if (maxV < save.get(character)) {
                maxV = save.get(character);
                maxK = character;
            }
        }
        if (maxK == '6') {
            if(!save.containsKey('9')){
                save.put('9',0);
            }
            while (save.get('6') > save.get('9')) {
                save.put('6',save.get('6')-1);
                save.put('9',save.get('9')+1);
            }
        } else if (maxK=='9') {
            if(!save.containsKey('6')){
                save.put('6',0);
            }
            while (save.get('9') > save.get('6')){
                save.put('9',save.get('9')-1);
                save.put('6',save.get('6')+1);
            }
        }
        int newMaxV = Integer.MIN_VALUE;
        for(Character character : save.keySet()) {
            if (newMaxV < save.get(character)) {
                newMaxV = save.get(character);
            }
        }
      return newMaxV;
    }
}
