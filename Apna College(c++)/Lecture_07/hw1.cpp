#include<iostream>
using namespace std;

bool check(int n){
    if(n<=0){
        return false;
    }
    int count =0;
    while(n > 0){
        if(n & 1){
            count++;
        }
        n >>=1;
    }
    return count == 1;
}

int main(){
    int n =32;

    if(check(n)){
        cout << "Yes Power of two";
    }
    else {
        cout << "No power of two";
    }

    

    return 0;
}