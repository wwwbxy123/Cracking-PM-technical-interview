class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target)
    {
        vector<int> res;
        for (int i = 0; i < nums.size(); i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    res = vector<int>({i, j});
                    break;
                }
            }
            if (res.size() > 0) break;
        }
        return res;
    }
};

