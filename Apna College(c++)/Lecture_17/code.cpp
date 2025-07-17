#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int> vec = {-1,0,2,3,5,6,7,8,8,8,8,9,12};
    int target = 12;
    int l =0;
    int r = vec.size()-1;
    int ans = -1;
    while(l<=r){
        int mid = (l+r)/2;
        if(vec[mid] == target){
            ans = mid;
            break;
        }
        else if(vec[mid] < target){
            l=mid+1;
        }
        else{
            r=mid-1;
        }
    }
    cout << ans;

}