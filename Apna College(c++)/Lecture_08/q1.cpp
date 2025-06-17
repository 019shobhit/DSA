#include <iostream>
using namespace std;

int sumArr(int arr[], int sz)
{
    int sum = 0;
    for (int i = 0; i < sz; i++)
    {
        sum += arr[i];
    }
    return sum;
}

int prodArr(int arr[], int sz)
{
    int prdct = 1;
    for (int i = 0; i < sz; i++)
    {
        prdct *= arr[i];
    }
    return prdct;
}

void swapMinMax(int arr[], int sz)
{
    int mxi = 0;
    int mni = 0;
    for (int i = 0; i < sz; i++)
    {
        if (arr[mxi] < arr[i])
        {
            mxi = i;
        }
        if (arr[mni] > arr[i])
        {
            mni = i;
        }
    }
    int temp = arr[mxi];
    arr[mxi] = arr[mni];
    arr[mni] = temp;
}

void unique(int arr[], int sz)
{
    for (int i = 0; i < sz; i++)
    {
        bool flag = true;
        for (int j = 0; j < sz; j++)
        {
            if (i != j && arr[i] == arr[j])
            {
                flag = false;
                break;
            }
        }
        if (flag)
        {
            cout << arr[i] << " ";
        }
    }
}

void common(int arr1[], int arr2[], int n)
{
    for(int i=0;i<n;i++){
        bool flag = false;
        for(int j=0;j<n;j++){
            if(arr1[i] == arr2[j]){
                flag = true;
                break;
            }
        }
        if(flag){
            cout << arr1[i] << " ";
        }
    }
}

int main()
{
    int arr1[] = {1, 2, 3, 4, 5};
    int arr2[] = {1, 3, 5, 6, 7};

    // cout << sumArr(arr, 5) << endl;
    // cout << prodArr(arr, 5) << endl;

    // for(int i=0;i<5;i++){
    //     cout << arr[i] << " ";
    // }
    // swapMinMax(arr,5);
    // cout << endl;

    // for(int i=0;i<5;i++){
    //     cout << arr[i] << " ";
    // }

    // unique(arr,8);
    common(arr1,arr2,5);
    // return 0;
}