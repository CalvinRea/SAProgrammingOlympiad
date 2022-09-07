#include <bits/stdc++.h>
using namespace std;

int main()
{

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    //Q1 Calvin Rea, C++ 17

    int a, b, c, d;
    cin >> a >> b >> c >> d;
    cout << a * d - b * c;
    return 0;

    //Q2 Calvin Rea, C++ 17

    int n;
    cin >> n;
    double ans = 0;
    for (double i = 1; i <= n; i++)
    {
        ans += i / (i + 1);
    }
    ans=round(ans*100);
    cout << ans / 100;
    

   //Q3 Calvin Rea, C++ 17

    string str;
    cin >> str;
    int arr[26] = {}; 
    int cost = 0;
    

    for (int i = 0; i < str.length(); i++)
    {
        int c = int(str.at(i)) - 96;//to get letter of alphabet
        if (arr[c-1] == 0){
            arr[c-1] = 1;
            cost++;
        }
    }

    cout << cost * str.length();
    
}