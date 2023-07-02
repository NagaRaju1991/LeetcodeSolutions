// https://leetcode.com/problems/optimal-partition-of-string/?envType=study-plan-v2&envId=amazon-spring-23-high-frequency
// 2405. Optimal Partition of String

class Solution {
    public int partitionString(String s) {
        int count = s.isEmpty() ? 0 : 1;
        s=s.toLowerCase();
        Set<Character> charset = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            if(charset.contains(s.charAt(i))) {
                charset.clear();
                count++;
            }
            charset.add(s.charAt(i));
        }
        return count;
    }
}
