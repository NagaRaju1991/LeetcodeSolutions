// 2645. Minimum Additions to Make Valid String
// https://leetcode.com/problems/minimum-additions-to-make-valid-string/description/

class Solution {
    public int addMinimum(String word) {
        int result = 0;
        for(int i=0;i<word.length();i++){        
            if(word.charAt(i) == 'a') {
                if(i+1<word.length() && word.charAt(i+1) == 'b') {
                    if(i+2<word.length() && word.charAt(i+2) == 'c') {
                        i=i+2;
                    } else {
                        result++;
                        i++;
                    }
                } else if (i+1<word.length() && word.charAt(i+1) == 'c'){
                    result++;
                    i++;
                } else {
                    result =result+2;
                }
            } else if(word.charAt(i) == 'b') {
                if(i+1<word.length() && word.charAt(i+1) == 'c') {
                    result++;
                    i++;
                } else
                    result = result+2;
            } else
                result = result + 2;
        }
        return result;
    }
}
