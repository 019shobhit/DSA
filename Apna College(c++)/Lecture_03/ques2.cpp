#include<iostream>
using namespace std;

int main(){
    int n=20;
    int a=0;
    int b =1;
    int c = 0;
    for(int i=0;i<=n;i++){
        cout << c << ", ";
        a=b;
        b=c;
        c=a+b;
    }
}