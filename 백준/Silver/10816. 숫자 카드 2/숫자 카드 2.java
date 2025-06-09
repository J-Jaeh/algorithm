import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        // 숫자카드는 정수한개가 있다, 상근이는 이런 카드 N개를 가지고있음
        // 정수 M개가 주어졌을때, 이숫자가 적혀있는 숫자 카드를 상근이가 몇개 가지고있을지?
        // 첫줄에 상근이가 가진 숫자카드 갯수
        // 둘째줄에 숫자카드에 적힌수 -10,000,000 ~ 10,000,000 ( 상근이가 가진)
        // 셋재줄에는 ? M이 주어짐  찾아야할 카드의 갯수
        // 넷재줄에는 카드의 숫자 !

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        HashMap<Integer, Integer> cardCountMap = new HashMap<>();

        // 가지고 있는거 셋팅.
        for (String card : cards) {
            int cardNum = Integer.parseInt(card);
            cardCountMap.put(cardNum, cardCountMap.getOrDefault(cardNum, 0) + 1);
        }

        M = Integer.parseInt(br.readLine());
        String[] findCards = br.readLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String findCard : findCards) {
            String count = find(findCard, cardCountMap);
            result.append(count).append(" ");
        }
        System.out.println(result.toString().trim());

    }

    private static String find(String findCard , HashMap<Integer, Integer> cardCountMap) {
        int cardNum = Integer.parseInt(findCard);
        if (cardCountMap.containsKey(cardNum)) {
            return String.valueOf(cardCountMap.get(cardNum));
        } else {
            return "0";
        }
    }
}
