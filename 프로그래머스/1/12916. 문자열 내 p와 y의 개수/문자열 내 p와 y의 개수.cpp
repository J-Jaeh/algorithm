#include <string>
#include <iostream>
#include <algorithm>
#include <cctype>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    transform(s.begin(),s.end(),s.begin(),::tolower);
    int p = count(s.begin(), s.end(), 'p'); 
    int y = count(s.begin(), s.end(), 'y');

    return (p == y);
}