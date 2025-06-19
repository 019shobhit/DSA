#include<iostream>
#include<vector>
using namespace std;

vector<int> pairSum(int arr[],int n,int target){
    vector<int> vec ;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(target == arr[i]+arr[j]){
                vec.push_back(arr[i]);
                vec.push_back(arr[j]);
                
            }
        }
    }
}
vector<int> pairSum1(int arr[],int n,int target){
    vector<int> vec ;
    int i=0;
    int j=n-1;
    while(i<j){
        if(arr[i] +arr[j] ==target){
            vec.push_back(arr[i]);
            vec.push_back(arr[j]);
            return vec;
        }
        else if(arr[i]+arr[j] > target){
            j--;
        }
        else if(arr[i] +arr[j] <target){
            i++;
        }
    }


    return vec;
}

int main(){
    int arr[] = {1,2,3,4,5,6,7};
    int target =13;
    int n = sizeof(arr)/sizeof(int);
    // vector<int> vec = pairSum(arr,n,target);
    vector<int> vec = pairSum1(arr,n,target);
    
    for(int i : vec){
        cout << i << " ";
    }


    return 0;
}