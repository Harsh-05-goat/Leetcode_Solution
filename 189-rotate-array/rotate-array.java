class Solution {
    public void rotate(int[] nums, int k) {
        /*
        int n = nums.length;
        k = k % n;     
        for (int i = 0; i < k; i++) {
            int lastEle = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastEle;
        }*/

        int n = nums.length;
        k = k % n;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }
}