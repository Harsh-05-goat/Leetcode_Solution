class Solution {
    public boolean uniformArray(int[] nums1) {
        int inf = Integer.MAX_VALUE;
        int min_number = inf;

        // Find the smallest odd number
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 1) {
                if (nums1[i] < min_number) {
                    min_number = nums1[i];
                }
            }
        }
        // Check every even number
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0 && min_number != inf && nums1[i] < min_number) {
                return false;
            }
        }
       return true;
    }
}