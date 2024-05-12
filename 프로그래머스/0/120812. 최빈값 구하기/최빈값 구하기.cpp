#include <string>
#include <vector>
#include <map>
#include <algorithm>
#include <iostream>

using namespace std;

bool cmp(const pair<int,int>& a, const pair<int,int>& b) {
	if (a.second == b.second) return a.first < b.first;
	return a.second > b.second;
}

int solution(vector<int> array)
{ 
    map<int,int> count;
    for(int i =0;i<array.size(); ++i)
    {
        int elem = array[i];
        if(count.find(elem) == count.end())
        {
            count.insert(pair<int,int>(elem,1));
        }
        else
        {
            count[elem] += 1;
        }
    }
    
    vector<pair<int,int>> vec( count.begin(), count.end() );
    sort(vec.begin(), vec.end(), cmp);

    if(vec.size() <= 1)
    {
        return vec[0].first;
    }
    else
    {
        if(vec[0].second == vec[1].second)
            return -1;
        else
            return vec[0].first;
    }
    
    return 0;
}