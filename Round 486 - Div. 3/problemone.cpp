#include <bits/stdc++.h>

using namespace std;

#define FAST ios::sync_with_stdio(0); cin.tie(0);
#define println(x) cout << x << '\n'
#define FOR(i, a) for(int i=0;i<a;i++)
#define F0R(i, a, b) for(int i=a;i<b;i++)

int main() { FAST
    int n, k;
    cin >> n >> k;
    vector<int> vec;
    bool arr[101];
    FOR(i, 101) arr[i] = false;
    FOR(i, n) {
        int x;
        cin >> x;
        if (!arr[x]) {
            arr[x] = true;
            vec.push_back(i + 1);
        }
    }
    if (vec.size() >= k) {
        println("YES");
        FOR(i, k) {
            cout << vec[i] << ' ';
        }
        cout << '\n';
    } else {
        println("NO");
    }
}
