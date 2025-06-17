#include<iostream>
using namespace std;

void revArray(int arr[],int sz){
    int i=0,j=sz-1;
    while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
}

int main(){
    int arr[] = {2,4,5,6,7,13,25,33,55};
    int sz = sizeof(arr)/sizeof(int);
    revArray(arr,sz);
    for(int i=0;i<sz;i++){
        cout << arr[i] << " ";
    }
    return 0;
}