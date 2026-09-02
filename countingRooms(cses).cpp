#include <iostream>
#include <vector>
#include <string>
using namespace std;

void dfs(vector<string>& grid, int i, int j, int n, int m) {

    if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == '#')
        return;

    grid[i][j] = '#';

    dfs(grid, i - 1, j, n, m); // Up
    dfs(grid, i + 1, j, n, m); // Down
    dfs(grid, i, j - 1, n, m); // Left
    dfs(grid, i, j + 1, n, m); // Right
}

int main() {

    int n, m;
    cin >> n >> m;

    vector<string> grid(n);

    for (int i = 0; i < n; i++) {
        cin >> grid[i];
    }

    int rooms = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {

            if (grid[i][j] == '.') {

                rooms++;

                dfs(grid, i, j, n, m);
            }
        }
    }

    cout << rooms << endl;

    return 0;
}
