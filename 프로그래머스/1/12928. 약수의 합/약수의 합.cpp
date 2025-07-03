#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    if (n<2) return n;
    vector<int> check(n+1,0);

    int answer = n+1;
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            int pair = n/i;
            if(!check[i]){
                answer+=i;
                check[i]=1;
            }
            
            if(!check[pair]){
                answer+=pair;
                check[pair]=1;
            }
        }
    }
    
    return answer;
}
