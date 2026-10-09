class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>duplicat= new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (duplicat.contains(nums[i])) {
                result.add(nums[i]);
            } else {
                duplicat.add(nums[i]);
            }
        }
        return result;
    }
}