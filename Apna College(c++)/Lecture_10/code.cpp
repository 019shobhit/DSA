#include<iostream>
#include<vector>
using namespace std;

int main(){
    int arr[] = {3,-4,5,4,-1,7,-8,15};
    int n = 8;

    int cs=0;
    int mx=0;

    for(int i=0;i<n;i++){
        cs+=arr[i];
        mx = max(cs,mx);
        if(cs <0){
            cs =0;
        }
    }
    



    // for(int i=0;i<n;i++){
    //     int sum = 0;
    //     for(int j=i;j<n;j++){
    //         sum+=arr[j];
    //         mx = max(sum,mx);
    //     }
    // }
    cout << mx;


    return 0;
}
