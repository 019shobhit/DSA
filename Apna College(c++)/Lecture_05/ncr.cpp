#include<iostream>
using namespace std;

int fact(int n){
    int f=1;
    for(int i=2;i<=n;i++){
        f*=i;
    }
    return f;
}

int main(){
    int n,r;
    cout << "Enter n: " ;
    cin >> n;
    cout << "Enter r: ";
    cin >> r;

    float ncr = fact(n)/(fact(r)*fact(n-r));

    cout << ncr;




    return 0;
}