class Solution {
    public int trap(int[] height) {

        int water = 0;

        for (int i = 1; i < height.length - 1; i++) {

            int left = 0, right = 0;

            for (int j = 0; j <= i; j++)
                left = Math.max(left, height[j]);

            for (int j = i; j < height.length; j++)
                right = Math.max(right, height[j]);

            water += Math.min(left, right) - height[i];
        }

        return water;
    }
}
