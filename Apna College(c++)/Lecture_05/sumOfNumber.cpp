#include<iostream>
using namespace std;

int main(){
    int num = 3134134;
    int sum =0;
    while( num>0){
        int x = num%10;
        sum+=x;
        num /=10;
    }
    cout << sum;
    return 0;
}