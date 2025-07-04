#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int cal(int to , int from,int at,vector<int> arr) {
    vector<int> sortArr;
    for (;to<=from;to++) {
        sortArr.push_back(arr[to]);
    }
    sort(sortArr.begin(),sortArr.end());

    return sortArr[at];
}
vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    for (vector<int> command : commands) {
        int to = command[0]-1;
        int from = command[1]-1;
        int at = command[2]-1;
        answer.push_back(cal(to,from,at,array));
    }

    return answer;
}