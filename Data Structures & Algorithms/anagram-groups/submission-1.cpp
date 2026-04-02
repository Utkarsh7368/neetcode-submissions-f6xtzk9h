class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int n = strs.size();
        unordered_map<string,vector<string>>mp;

        for(auto &x : strs){
            string key = x;              // copy
            sort(key.begin(), key.end()); // sort copy

            mp[key].push_back(x); 
        }

        vector<vector<string>> res;

        for(auto &x : mp){
            res.push_back(x.second);
        }
        return res;
    }
};
