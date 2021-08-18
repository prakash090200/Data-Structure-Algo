https://leetcode.com/problems/word-search-ii/submissions/



class Solution {
public List findWords(char[][] board, String[] words) {

    HashSet<String> found = new HashSet();
    
    for(int x = 0; x < board.length; x++){
        for(int y = 0; y < board[0].length; y++){
            for(String word : words){
                if(!found.contains(word) && exist(board, x, y, word, 0)){
                    found.add(word);
                }
            }
            
        }
    }
    
    return new ArrayList<String>(found);
    
}

public boolean exist(char[][] board, int x, int y, String word, int wordIndex){
    
    if(wordIndex == word.length()) return true;
    
    if(
        x < 0 || 
        x >= board.length || 
        y < 0 || y >= board[0].length || 
        board[x][y] == '$' ||   
        board[x][y] != word.charAt(wordIndex)){
        
        return false;
    }
    
    char ch =  board[x][y];
    
    board[x][y] = '$';
    
    boolean isExist = exist(board, x + 1, y, word, wordIndex + 1) ||
        exist(board, x - 1, y, word, wordIndex + 1) || 
        exist(board, x, y + 1, word, wordIndex + 1) || 
        exist(board, x, y - 1, word, wordIndex + 1);
        
    board[x][y] = ch;
    
    return isExist;
}
}