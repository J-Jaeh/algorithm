#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
#include <sstream> 

using namespace std;

string solution(vector<string> seoul) {

    int i = distance(seoul.begin(), find(seoul.begin(), seoul.end(), "Kim"));

    // string answer = "김서방은 "+to_string(i)+"에 있다";
    ostringstream oss;
    oss << "김서방은 " << i << "에 있다";
    return oss.str();
}
