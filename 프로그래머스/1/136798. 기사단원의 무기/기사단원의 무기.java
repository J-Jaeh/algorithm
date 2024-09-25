class Solution {
    static boolean[] p = new boolean[100001];
    public int solution(int number, int limit, int power) {
        setP();
        int answer = 0;
        for(int i =1;i<=number;i++){
            int temp = countN(i);
            if(temp>limit){
                answer+=power;
            }else{
                answer+=temp;
            }
        }
        return answer;
    }
    private void setP(){
        p[0]=true;
        p[1]=true;
        for(int i =2;i*i<100001;i++){
            if(!p[i]){
                for(int j = i*2;j<100001;){
                    p[j]=true;
                     j+=i;
                }
            }
        }
    }
    
    private int countN(int num){
        int count=0;
        if (num == 1) return 1;
        //소수면 2를 리턴 시키면 될라나 ~?
        if (!p[num]) return 2;

        for(int i =1; i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(i*i==num){
                    count++;
                    continue;
                }
                count+=2;// 더개선할수있는데 일단 실행먼저.
            }
        }
        return count;
    }
}