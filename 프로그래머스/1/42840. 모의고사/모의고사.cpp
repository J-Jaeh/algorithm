#include <string>
#include <vector>
#include <queue>

using namespace std;

int score(vector<int> peak,vector<int> answer) {
    int score = 0;
    for(int i=0;i<answer.size();i++) {
        if (answer[i] == peak[i%peak.size()]) {
            score ++;
        }
    }
    return score;
}


vector<int> solution(vector<int> answers) {
    priority_queue<int> pq ;
    vector<int> temp;
    vector<int> answer;

    vector<int> n1 = {1,2,3,4,5};
    vector<int> n2 = {2, 1, 2, 3, 2, 4, 2, 5};
    vector<int> n3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    vector<vector<int>> nnn;

    nnn.push_back(n1);
    nnn.push_back(n2);
    nnn.push_back(n3);

    for (vector<int> n : nnn) {
        int sc = score(n,answers);
        pq.push(sc);
        temp.push_back(sc);
    }
    int maxScore = pq.top();

    for (int i=1;i<=3;i++) {
        if (maxScore == temp[i-1]) {
            answer.push_back(i);
        }
    }
    return answer;
}
