class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>data=new HashSet<>();
        for (int num : nums) {
            if (data.contains(num)) {
                return true;
            }
            data.add(num);
        }

        return false;
    }
}