class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] nums=new int[n+m];
        for(int i=0;i<n;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            nums[n+i]=nums2[i];
        }
        Arrays.sort(nums);
        double med;
        int a=nums.length;
        if(a%2==1){
            med=nums[a/2];
        }
        else{
            med=(nums[a/2-1]+nums[a/2])/2.0;
        }
        return med;
    }
}