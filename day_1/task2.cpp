#include <vector>
#include <iostream>
#include <cassert>

using namespace std;


class Solution {
public:
    int pivotIndex(vector<int> &nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (auto &x: nums) {
            totalSum += x;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (leftSum == totalSum - nums[i]) {
                return i;
            } else {
                leftSum += nums[i];
                totalSum -= nums[i];
            }
        }

        return -1;
    }
};

int main() {
    Solution solution;

    {
        vector<int> v = {1, 7, 3, 6, 5, 6};
        const int res = solution.pivotIndex(v);
        cout << res << endl;
        assert(res == 3);
    }

    {
        vector<int> v = {1, 2, 3};
        const int res = solution.pivotIndex(v);
        cout << res;
        assert(res == -1);
    }


}