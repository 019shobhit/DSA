#include <iostream> 
using namespace std;

int main(){
    char c;
    cout << "Enter character : ";
    cin >> c;
    if(c>=65 && c<=90){
        cout << "capital letter";
    }
    else{
        cout << "smal letter";
    }

    return 0;
}