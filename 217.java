// 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/
class Solution {
    /public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int i : nums) {
            if(!numbers.add(i)) {
                return true;
            }
        }
        return false;
    }
}
