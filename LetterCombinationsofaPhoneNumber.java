class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> lookup = List.of("0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        List<String> result = new ArrayList<>();
        result.add("");
        int s = 0, e = 1;
        for (int i = 0; i < digits.length(); i++, s = e) {
            String list = lookup.get(digits.charAt(i) - '0');
            e = result.size();
            for (int j = 0; j < list.length(); j++) {
                char ch = list.charAt(j);
                for (int k = s; k < e; k++) {
                    result.add(result.get(k) + ch);
                }
            }
        }
        return result.subList(e, result.size());
    }
}
