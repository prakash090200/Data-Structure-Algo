
https://leetcode.com/problems/robot-bounded-in-circle/

/// Robot Bounded In Circle


class Solution {
    public boolean isRobotBounded(String s) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] pos = {0, 0};
        int dir = 0;
        for(char c: s.toCharArray()){
            if(c == 'L') dir = (dir + 3) % 4;
            else if(c == 'R') dir= (dir + 1) % 4;
            else{
                pos[0] += directions[dir][0];
                pos[1] += directions[dir][1];
            }
        }
        return (pos[0] == 0 && pos[1] == 0) || dir != 0;
    }
}

******************************************************************************

class Solution {
    public boolean isRobotBounded(String instructions) {
        char[] ins=instructions.toCharArray();
        int x=0;
        int y=0;
        char dir='N';
        
        for(char pos:ins){
            
            switch(pos){
                case 'G':
                    if(dir=='E')
                        x++;
                    else if(dir=='W')
                        x--;
                    else if(dir=='N')
                        y++;
                    else if(dir=='S')
                        y--;
                    break;
                case 'L':
                    if(dir=='E')
                        dir='N';
                    else if(dir=='W')
                        dir='S';
                    else if(dir=='N')
                        dir='W';
                    else if(dir=='S')
                        dir='E';
                    break;
                case 'R':
                    if(dir=='E')
                        dir='S';
                    else if(dir=='W')
                        dir='N';
                    else if(dir=='N')
                        dir='E';
                    else if(dir=='S')
                        dir='W';
                    break;
            }
                        
        }
        
        
        if((x==0 && y==0) || dir!='N'){
            return true;
        }
        
        return false;
    }
}