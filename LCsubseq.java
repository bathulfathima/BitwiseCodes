import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int a = str1.length();
        int b = str2.length();
        int grid[][] = new int[a + 1][b + 1];
        int max = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    grid[i][j] = grid[i - 1][j - 1] + 1;
                    max = Math.max(max, grid[i][j]);
                } else {
                    grid[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        System.out.println(max);
    }
}
