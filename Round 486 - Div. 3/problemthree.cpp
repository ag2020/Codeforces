#include <bits/stdc++.h>

using namespace std;

#define FAST ios::sync_with_stdio(0); cin.tie(0);
#define println(x) cout << x << '\n'
#define FOR(i, a) for(int i=0;i<a;i++)

int main() { FAST
    map<int, pair<int, int> > mapp;
    int k;
    cin >> k;
    FOR(i, k) {
        int n;
        cin >> n;
        int sum = 0;
        int arr[n];
        int x;
        FOR(j, n) {
            cin >> x;
            sum += x;
            arr[j] = x;
        }
        FOR(j, n) {
            int diff = sum - arr[j];
            if (mapp.count(diff) != 0) {
                pair<int, int> pai = mapp.at(diff);
                if (pai.first != i) {
                    println("YES");
                    cout << to_string(i + 1) + " " + to_string(j + 1) << '\n';
                    cout << to_string(pai.first + 1) + " " + to_string(pai.second + 1) << '\n';
                    return 0;
                }
            } else {
                mapp.insert(make_pair(diff, make_pair(i, j)));
            }
        }
    }
    println("NO");
}
