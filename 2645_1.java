// 2645. Minimum Additions to Make Valid String
// https://leetcode.com/problems/minimum-additions-to-make-valid-string/description/
class Solution {
    public int addMinimum(String word) {
        int result = 0;
        for(int i=0;i<word.length();){
            if(word.charAt(i)=='a') {
                i++;
            } else {
                result++;
            }
            if(i<word.length() && word.charAt(i)=='b') {
                i++;
            } else
                result++;
            if(i<word.length() && word.charAt(i)=='c') {
                i++;
            } else 
                result++;
        }
        return result;
    }
}
