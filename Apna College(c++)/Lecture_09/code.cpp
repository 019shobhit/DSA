#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int> vec;
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(3);
    vec.push_back(3);
    vec.push_back(3);

    cout << vec.size() << endl;
    cout << vec.capacity();

    // for(int i :vec)
    // cout << i << " ";

    // cout << endl ;

    // for(char i :c)
    // cout << i << " ";

    return 0;

}