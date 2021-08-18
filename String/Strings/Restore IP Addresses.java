https://leetcode.com/problems/restore-ip-addresses/

//Restore IP Addresses

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>list = new LinkedList<>();
        dfs(s, new StringBuilder(), 4, list);
        return list;
    }

    private void dfs(String s, StringBuilder res, int count, List<String>list) {
     
        if (count * 3 < s.length() || count > s.length()) {
            return;
        }
  
        if (count == 0) {
            list.add(res.substring(0, res.length() - 1));
            return ;
        }
        for (int i=1; i<=3; ++i) {
           
            if (i > s.length()) {
                break;
            }
            String sec = s.substring(0, i);
            if (sec.length() > 1 && sec.startsWith("0")) {
                break;
            }
            if (sec.length() == 3 && Integer.parseInt(sec) > 255) {
                continue;
            }
			
            int len = res.length();
            dfs(s.substring(i), res.append(sec).append("."), count - 1, list);
            res.setLength(len);
        }
    }
}