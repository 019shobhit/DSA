#include<iostream>
using namespace std ;

int main(){
    int n =0;
    for(int i=0;i<100;i++){
        if(i%2==0){
            
            n+=i;
        }
    }
    cout << n;

    return 0;
}