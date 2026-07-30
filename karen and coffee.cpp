#include <iostream>
using namespace std;
int main() {
    int n, k, q;
    cin >> n >> k >> q;
    int a[200002] = {0};

    while (n--) {
        int l, r;
        cin >> l >> r;
        a[l]++;
        a[r + 1]--;
    }
    for (int i = 1; i <= 200000; i++)
        a[i] += a[i - 1];
    int pre[200002] = {0};
    for (int i = 1; i <= 200000; i++) {
        pre[i] = pre[i - 1];
        if (a[i] >= k)
            pre[i]++;
    }
    while (q--) {
        int l, r;
        cin >> l >> r;
        cout << pre[r] - pre[l - 1] << endl;
    }

    return 0;
}
