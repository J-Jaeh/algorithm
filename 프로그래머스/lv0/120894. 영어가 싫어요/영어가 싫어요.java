class Solution {
    public long solution(String numbers) {

       String a = numbers.replaceAll("one","1");
       String z = a.replaceAll("two","2");
       String b = z.replaceAll("three","3");
       String c = b.replaceAll("four","4");
       String d = c.replaceAll("five","5");
       String e = d.replaceAll("six","6");
       String f = e.replaceAll("seven","7");
       String g = f.replaceAll("eight","8");
       String h = g.replaceAll("nine","9");
       String i = h.replaceAll("zero","0");

       long  answer = Long.parseLong(i);

        return answer;
    }
}