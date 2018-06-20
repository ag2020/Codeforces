#include <bits/stdc++.h>

using namespace std;

#define FAST ios::sync_with_stdio(0); cin.tie(0);
#define println(x) cout << x << '\n'
#define FOR(i, a) for(int i=0;i<a;i++)
#define F0R(i, a, b) for(int i=a;i<b;i++)

bool cmp (string s1, string s2) {
    return s1.length() < s2.length();
}

int main() { FAST
    int n;
    cin >> n;
    string arr[n];
    FOR(i, n) cin >> arr[i];
    sort(arr, arr + n, cmp);
    FOR(i, n - 1) {
        if (arr[i + 1].find(arr[i]) == string::npos) {
            println("NO");
            return 0;
        }
    }
    println("YES");
    FOR(i, n) println(arr[i]);
}
