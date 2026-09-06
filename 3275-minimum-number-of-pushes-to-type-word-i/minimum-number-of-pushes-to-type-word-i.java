class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int rest = 0;
        for(int i = 0;i<n;i++){
            rest += (i/8 + 1);
        }
        return rest;
    }
}