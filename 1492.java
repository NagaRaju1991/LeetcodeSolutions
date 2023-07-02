// https://leetcode.com/problems/the-kth-factor-of-n/description/?envType=study-plan-v2&envId=amazon-spring-23-high-frequency
// 1492. The kth Factor of n
class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        int result=0;
        for(int i=1; i<=n; i++) {
            if(n%i==0)
                factors.add(i);
        }
        if(k>factors.size()) {
            result=-1;
        } else {
            result = factors.get(k-1);
        }
        return result;
    }
}
