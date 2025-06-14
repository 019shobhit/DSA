#include<iostream>
using namespace std;

int main(){
    int n;
    cout << "enter number to check whether it is prime or n not: ";
    cin >> n;
    bool flag = true;
    for(int i=2;i*i<=n ;i++){
        if(n%i==0){
            flag =false;
            break;
        }
    }
    flag == false ? cout << "non prime number" : cout << "prime number"; 
}