#include <algorithm>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int maxStd =n;

    sort(lost.begin(), lost.end());
    sort(reserve.begin(), reserve.end());
    // 2 3 4
    // 2 3 4
    vector<int> rlost;
    
    for (int l : lost) {
        if (find(reserve.begin(), reserve.end(), l) != reserve.end()) {
            reserve.erase(find(reserve.begin(), reserve.end(), l));
        }else {
            rlost.push_back(l);
        }
    }


    for (int l : rlost) {
        if (find(reserve.begin(), reserve.end(), l-1) != reserve.end()) {
            reserve.erase(find(reserve.begin(), reserve.end(), l-1));
            continue;
        }

        if (find(reserve.begin(), reserve.end(), l+1) != reserve.end()) {
            reserve.erase(find(reserve.begin(),reserve.end(),l+1));
            continue;
        }
        maxStd--;
    }
    return maxStd;
}