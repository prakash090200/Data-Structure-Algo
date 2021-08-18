https://leetcode.com/problems/remove-invalid-parentheses/submissions/

//Remove Invalid Parentheses

//BEST

class Solution {
 public List<String> removeInvalidParentheses(String s) {
    int rmL = 0, rmR = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            rmL++;
        } else if (s.charAt(i) == ')') {
            if (rmL != 0) {
                rmL--;
            } else {
                rmR++;
            }
        }
    }
    Set<String> res = new HashSet<>();
    dfs(s, 0, res, new StringBuilder(), rmL, rmR, 0);
    return new ArrayList<String>(res);
}

public void dfs(String s, int i, Set<String> res, StringBuilder sb, int rmL, int rmR, int open) {
    if (rmL < 0 || rmR < 0 || open < 0) {
        return;
    }
    if (i == s.length()) {
        if (rmL == 0 && rmR == 0 && open == 0) {
            res.add(sb.toString());
        }        
        return;
    }

    char c = s.charAt(i); 
    int len = sb.length();

    if (c == '(') {
        dfs(s, i + 1, res, sb, rmL - 1, rmR, open);		    // not use (
    	dfs(s, i + 1, res, sb.append(c), rmL, rmR, open + 1);       // use (

    } else if (c == ')') {
        dfs(s, i + 1, res, sb, rmL, rmR - 1, open);	            // not use  )
    	dfs(s, i + 1, res, sb.append(c), rmL, rmR, open - 1);  	    // use )

    } else {
        dfs(s, i + 1, res, sb.append(c), rmL, rmR, open);	
    }

    sb.setLength(len);        
}
}


********************************************************************************************


class Solution {
     public List<String> removeInvalidParentheses(String s) {
        List<String> ret = new ArrayList<>();
        if (s == null) Arrays.asList("");
        List<String> candidates = new LinkedList<>();
        Set<String> tried = new HashSet<>();
        candidates.add(s);
        while (!candidates.isEmpty()) {
            for (String p : candidates) {
                if (isValid(p)) ret.add(p);
            }
            if (!ret.isEmpty()) return ret;
            List<String> nextLevel = new LinkedList<>();
            for (String p : candidates) {
                for (int i = 0; i < p.length(); ++i) {
                    if (p.charAt(i) != '(' && p.charAt(i) != ')') continue;
                    // bug - 2 => it's okay to have p.substring(0, 0) and p.substring(p.length());
                    String t = p.substring(0, i) + p.substring(i + 1);
                    if (tried.contains(t)) continue;
                    nextLevel.add(t);
                    tried.add(t);
                }
            }
            candidates = nextLevel;
        }
        return ret;
    }

    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            if (c == ')' && count-- == 0) return false;
        }

        return count == 0;
    }
}