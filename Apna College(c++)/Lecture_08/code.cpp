#include <iostream>
using namespace std;

int main()
{

    int marks[] = {11, 32, 3, 44, 55};
    int target =3;
    int idx =-1;
    for(int i=0;i<sizeof(marks)/sizeof(int);i++){
        if(marks[i]==target){
            idx=i;
            break;
        }
    }
    cout << idx;
    return 0;
}