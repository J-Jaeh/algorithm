class Solution {
    public int solution(int hp) {
        int[] damge ={5,3,1};
        int count =0;
        for(int a : damge){
            count += hp/a;
            hp-=a*(hp/a);
        }
        
        
        return count;
    }

}

