#include <bits/stdc++.h>
using namespace std;

int main()
{

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    // Q1 Calvin Rea,C++17

    double a, b;
    cin >> a >> b;
    double answer = a / (b * b);
    cout << floor(answer);

    // Q2 Calvin Rea,C++17

    char c;
    cin >> c;

    string alphabetInReverse = "zyxwvutsrqponmlkjihgfedcba";
    int start = alphabetInReverse.find(c);
    for (int i = start; i < alphabetInReverse.length(); i += 2)
    {
        cout << alphabetInReverse.at(i);
    }

    // Q3 Calvin Rea,C++17

    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int count = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {

            if (abs(arr[i] - arr[j]) <= 10)
            {
                count++;
            }
        }
    }
    cout << count;

    return 0;
}