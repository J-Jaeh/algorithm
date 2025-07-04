#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> sk;
    sk.push_back(arr[0]);

    for(int a : arr){
        if(sk.back()!=a){
            sk.push_back(a);
        }
    }
    return sk;
}
