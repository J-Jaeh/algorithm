import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        if (str1.toLowerCase().equals(str2.toLowerCase())) return 65536;
        // 공통된수/총합친수 //////////////
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        List<String> sbList1 = ns(sb1, str1.length());
        List<String> sbList2 = ns(sb2, str2.length());

        Map<String,Integer> sbMap1 = new HashMap<>();
        Map<String,Integer> sbMap2 = new HashMap<>();

        for (String s : sbList1) {
            if(sbMap1.containsKey(s)){
                sbMap1.put(s,sbMap1.get(s)+1);
            }else{
                sbMap1.put(s,1);
            }
        }
        for (String s : sbList2) {
            if(sbMap2.containsKey(s)){
                sbMap2.put(s,sbMap2.get(s)+1);
            }else{
                sbMap2.put(s,1);
            }
        }

        double son=0;
        double parent=0;
        for (String key : sbMap1.keySet()) {
            //공통값의 분자 , 분모 넣기 ,
            if(sbMap2.containsKey(key)){
                son+= Math.min(sbMap1.get(key), sbMap2.get(key));
                parent+= Math.max(sbMap1.get(key), sbMap2.get(key));
            }else{
                //공통되지 않은 map1만의 값 넣기
                parent+=sbMap1.get(key);
            }
        }
        // map2만 가지고 있는 값 넣기
        for (String key : sbMap2.keySet()) {
            if(!sbMap1.containsKey(key)){
                parent+=sbMap2.get(key);
            }
        }
        // 계산
        double answer = (son/parent)*65536;
        return (int)answer;
    }


    private List<String> ns(StringBuilder input,int size){
        List<String> returnList = new ArrayList<>();
        // size ==> 짝수가 오게 해야함 if  4 라면?
         for(int i=0;i<size-1;i++){
            String substring = input.substring(i, i + 2);
            char[] charArray = substring.toCharArray();
            boolean flag=false;
            for (Character c : charArray) {
                if(!Character.isAlphabetic(c)){
                    flag=true;
                }
            }
            if(flag) continue;

            String lowerCase = substring.toLowerCase();
            returnList.add(lowerCase);
        }
        return returnList;
    }
}