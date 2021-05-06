https://leetcode.com/problems/letter-combinations-of-a-phone-number/

/// Letter Combinations of a Phone Number



class Solution {
    public List<String> letterCombinations(String digits) {
        
		
        List<String> out = new ArrayList<>();
        if (digits.isEmpty())
            return out;
        String[] strings = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		
        out.add("");
		
	
        for (char ch : digits.toCharArray()) {
		
			
            List<String> temp = new ArrayList<>();
			
			
            for (String str : out) {
			
				
                String letters = strings[Integer.parseInt(String.valueOf(ch))];
				
				
                for (char letter : letters.toCharArray()) {
                    temp.add(str + String.valueOf(letter));
                }
            }
			
	
            out = temp;
        }
        return out;
    }
}