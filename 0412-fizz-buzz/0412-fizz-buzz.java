class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currentStr = "";
            if (divisibleBy3) {
                currentStr += "Fizz";
            }
            if (divisibleBy5) {
                currentStr += "Buzz";
            }
            if (currentStr.isEmpty()) {
                currentStr += String.valueOf(i);

            }
            answer.add(currentStr);
        }
        return answer;
    }
    /// time complexity :O(n)
    /// space complexity :costant =O(1)
};
