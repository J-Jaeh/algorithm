
import java.util.*;
class Solution {
    static List<Person> peoples = new ArrayList<>();

    public int solution(int[] people, int limit) {
        // 큰놈 태우고 그나머지에 해당하는 놈 채우기 ~
        int answer = 0;
        for (Integer i : people) {
            peoples.add(new Person(i));
        }
        peoples.sort((p1,p2)->p2.w-p1.w);

        //투포인터
        int lp =0;
        int rp = peoples.size()-1;
        while (lp<=rp){
            //한큐에 해결하고싶은 마음 내 짞을 찾아라 ~
            int minV=peoples.get(lp).w;
            if (minV+peoples.get(rp).w <=limit){
                    rp--;
            }
            lp++;
            answer++;
        }

        return answer;
    }
    private class Person{
        int w;
        boolean out;

        public Person(int w) {
            this.w = w;
        }
    }
}
