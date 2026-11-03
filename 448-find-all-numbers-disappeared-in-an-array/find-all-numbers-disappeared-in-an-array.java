import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> res= new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}