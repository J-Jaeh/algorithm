import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize==0){
            return cities.length*5;
        }
        int answer = 0;
        List<String> cache = new ArrayList<>();
        //초기셋팅

        for (String s : cities) {
            String city = s.toLowerCase();
            if (cache.contains(city) && cache.size() < cacheSize) {
                answer += 1;
                cache.remove(city);
                cache.add(city);
                continue;
            } else if (cache.size() < cacheSize) {
                cache.add(city);
                answer += 5;
                continue;
            }

            if (cache.contains(city)) {
                answer += 1;
                cache.remove(city);
                cache.add(city);
            } else {
                answer += 5;
                cache.remove(0);
                cache.add(city);
            }
        }
        return answer;
    }
}