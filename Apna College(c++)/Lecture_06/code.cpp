#include <iostream>
using namespace std;

long long decToBinary(long long n)
{
    long long ans = 0LL, pow = 1LL;
    while (n > 0)
    {
        ans += ((n % 2) * pow);
        n /= 2;
        pow *= 10;
    }
    return ans;
}

long long binaryToDecimal(long long n)
{
    long long ans = 0LL;
    long long pow = 1LL;
    while (n > 0)
    {
        ans += ((n%10)*pow);
        n /= 10;
        pow *= 2;
    }
    return ans;
}

int main()
{
    cout << "Enter decimal number to convert it into binary: ";
    long long decNum;
    cin >> decNum;
    long long ans = decToBinary(decNum);
    cout << ans << endl;

    cout << binaryToDecimal(ans);


    return 0;
}