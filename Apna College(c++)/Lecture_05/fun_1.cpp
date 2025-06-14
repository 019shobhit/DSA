#include <iostream>
using namespace std;

int printSum(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    return sum;
}

int main(){
    int n ;
    cout << "Enter number to get sum: ";
    cin >> n;
    cout << printSum(n);

    return 0;
}