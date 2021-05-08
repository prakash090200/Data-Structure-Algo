
https://practice.geeksforgeeks.org/problems/find-distinct-elements2054/1#

////count of all the distinct elements common to all rows of the matrix

class Solution{
    static int distinct(int a[][], int n)
    {
        Set<Integer> hash = new HashSet<Integer>();
        	for(int k=0; k<n; k++){
                hash.add(a[0][k]); 
            }
            Set<Integer> hash1 = new HashSet<Integer>(n);
            Set<Integer> diff = new HashSet<Integer>(n);
            for(int j=1; j<n; j++){
                for(int k=0; k<n; k++){
                    hash1.add(a[j][k]);
                }
                for(int e:hash){
                    if(!hash1.contains(e)){
                        diff.add(e);
                    }
                }
                hash1.clear();
                hash.removeAll(diff);
                diff.clear();
            }
            
            int count = hash.size();
            return count;
        }
    }
