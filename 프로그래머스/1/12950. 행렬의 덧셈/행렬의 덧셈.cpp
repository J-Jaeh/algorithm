#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
     int vSize = arr1.size();
     int vvSize = arr1[0].size();
    vector<vector<int>> answer(vSize,vector<int>(vvSize));
     for(int i=0;i<vSize;i++){
        for(int j=0;j<vvSize;j++){
            answer[i][j]= arr1[i][j]+arr2[i][j];
        }
     }
    return answer;
}
