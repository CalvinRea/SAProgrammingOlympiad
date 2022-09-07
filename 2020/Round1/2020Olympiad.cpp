#include <bits/stdc++.h>
using namespace std;

int main()
{

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    // Q1 Calvin Rea, C++17

     int chickens, cows, bees;
     cin >> chickens >> cows >> bees;
     cout << (chickens*2+cows*4+bees*6);

    // Q2 Calvin Rea, C++17

     int n;
     cin >> n;
     long long ans=0;
     long long j = 1;
     for (int i = 1; i <= n; i+=2)
     {
         ans += j;
         j *= 4;
     }
     cout << ans;

    // Q3 Calvin Rea, C++17

    string str;
    cin >> str;
    string unplussed = "";
    string answer = "";
    for (int i = 0; i < str.length(); i += 2)
    {
        unplussed += str[i];
    }

    sort(unplussed.begin(), unplussed.end());

    for (int i = unplussed.length() - 1; i > 0; i--)
    {
        answer += unplussed.at(i);
        
    }
    answer += unplussed.at(0);
    cout << answer;

    return 0;
    
}
