import java.util.*;

public class Solution {
    public int solution(String begin, String target, String[] words) {
        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        Deque<Word> q = new ArrayDeque<>();
        q.add(new Word(begin,0));
        List<String> ben = new ArrayList<>(); 
        while (!q.isEmpty()){
            Word word = q.pollFirst();
            if (word.word.equals(target)){
                return word.count;
            }
            ben.add(word.word);
            for (String s : words) {
                if(!ben.contains(s) && checkWord(word.word,s)){
                    ben.add(s);
                    q.add(new Word(s, word.count+1));
                }
            }
        }
        return 0;
    }
    private boolean checkWord(String a,String b){
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        int i = 0;
        int count=0;
        for (char ac : aArray) {
            if(ac!=bArray[i++]) count++;
            if(count>2) return false;
        }
        return count==1;
    }

    private class Word{
        String word;
        int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}
