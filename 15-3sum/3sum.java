class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet = new ArrayList<>();

                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);
                        if (result.contains(triplet) == false) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
        */

                int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
 
        // Three different indices are required.
        if (n < 3) {
            return answer;
        }
 
        Arrays.sort(nums);
 
        for (int fixed = 0; fixed < n - 2; fixed++) {
            /*
             * Skip the same fixed value to avoid
             * generating duplicate triplets.
             */
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                continue;
            }
 
            int left = fixed + 1;
            int right = n - 1;
 
            while (left < right) {
                long sum =
                    (long) nums[fixed] +
                    nums[left] +
                    nums[right];
 
                // A smaller sum needs a larger left value.
                if (sum < 0) {
                    left++;
                }
                // A larger sum needs a smaller right value.
                else if (sum > 0) {
                    right--;
                }
                else {
                    answer.add(Arrays.asList(
                        nums[fixed],
                        nums[left],
                        nums[right]
                    ));
 
                    left++;
                    right--;
 
                    /*
                     * Skip repeated values so the same
                     * triplet is not added again.
                     */
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }
 
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
 
        return answer;
    }
}