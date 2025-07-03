#include <string>
// #include <algorithm>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    
    while(n >0) {
        int d = n % 10;
        answer.push_back(d);
        n /= 10;
    }
    // reverse(answer.begin(), answer.end());
    return answer;
}
