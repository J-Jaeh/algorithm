class Solution {
public StringBuffer  solution(int age) {
        StringBuffer answer = new StringBuffer();

        String stringAge= age+"";

        char[] chars = stringAge.toCharArray();

        for (char c : chars) {
            answer.append((char)(c+49));
        }

        return answer;
    }
}