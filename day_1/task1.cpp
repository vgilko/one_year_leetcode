#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    vector<int> runningSum(vector<int> &nums) {
        vector<int> result = vector<int>(nums);

        for (int i = 1; i < nums.size(); i++) {
            result[i] += result[i - 1];
        }

        return result;
    }
};

void print_vector(vector<int> &values) {
    for (auto &v: values) {
        cout << v << " ";
    }
    cout << endl;
}

int main() {
    Solution solution;

    vector<int> v = {3, 1, 2, 10, 1};
    vector<int> res = solution.runningSum(v);

    print_vector(res);
}