#include <string>
#include <vector>

using namespace std;

int solution(vector<int> a, vector<int> b) {
    int index =0;
    int answer = 0;

    for(int i : a){
        int bv =b.at(index++);
        answer +=i*bv;
    }
    return answer;
}