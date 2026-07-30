import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1')
                    count++;
                else
                    count--;

                if (count == 0)
                    ans = Math.max(ans, j - i + 1);
            }
        }
        System.out.println(ans);
    }
}
