class Solution {
    public String mergeAlternately(String word1, String word2) {
         int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < m || j < n;){
            if(i<m){
                result.append(word1.charAt(i++));
            }
            if(j<n){
                 result.append(word2.charAt(j++));
            }
        }
        return result.toString();
    }
    //time complexity=O(n+m)
    // space complexity =O(1)
}