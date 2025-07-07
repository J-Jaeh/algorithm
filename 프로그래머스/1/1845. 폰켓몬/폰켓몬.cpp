#include <vector>
#include <set>

using namespace std;

int solution(vector<int> nums)
{
    int target = nums.size()/2;
    set<int> max;
    for (int n : nums) {
        max.insert(n);
    }
    int min = max.size();
    if (target < min) {
        return target;
    }
    return min;
}