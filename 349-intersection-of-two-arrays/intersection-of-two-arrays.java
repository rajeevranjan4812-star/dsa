class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res = new HashSet<>();
        // Step 1
        for (int x : nums1) {
            res.add(x);
        }
        HashSet<Integer> result = new HashSet<>();
        // Step 2
        for (int x : nums2) {
            if (res.contains(x)) {
                result.add(x);
            }
        }
        // Step 3
        int[] ans = new int[result.size()];
        int i = 0;
        for (int x : result) {
            ans[i++] = x;
        }
        return ans;
    }
} 