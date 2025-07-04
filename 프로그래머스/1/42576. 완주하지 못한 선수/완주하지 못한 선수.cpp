#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {

    unordered_map<string, int> um;
    for (string p : participant) {
        if (um.find(p) == um.end()) {
            um[p] = 1;
        }else {
            um[p]++;
        }
    }
    
    for (string s : completion) {
        um[s]--;
    }

    for (string p : participant) {
        if (um[p] != 0) {
            return p;
        }
    }
    
}