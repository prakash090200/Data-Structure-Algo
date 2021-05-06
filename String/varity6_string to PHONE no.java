https://practice.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence0547/1#

////Convert a sentence into its equivalent mobile numeric keypad sequence

class Solution 
{ 
    String printSequence(String str) 
    { 
      HashMap<Character,Integer> map = new HashMap<>();
      String ans="";
	        map.put('A',2);
	        map.put('B',22);
	        map.put('C',222);
	        map.put('D',3);
	        map.put('E',33);
	        map.put('F',333);
	        map.put('G',4);
	        map.put('H',44);
	        map.put('I',444);
	        map.put('J',5);
	        map.put('K',55);
	        map.put('L',555);
	        map.put('M',6);
	        map.put('N',66);
	        map.put('O',666);
	        map.put('P',7);
	        map.put('Q',77);
	        map.put('R',777);
	        map.put('S',7777);
	        map.put('T',8);
	        map.put('U',88);
	        map.put('V',888);
	        map.put('W',9);
	        map.put('X',99);
	        map.put('Y',999);
	        map.put('Z',9999);
	        map.put(' ',0);
	        for(int i=0;i<str.length();i++) {
	            char ch = str.charAt(i);
	            ans+=map.get(ch);
	        }
        return ans;
    }
}


************************************************


class GFG
 {
	public static void main (String[] args)
	 {
        Scanner cs=new Scanner(System.in);
        int n,i,temp;
        String t=cs.nextLine();
        int te=Integer.parseInt(t);
        int ar[]={2,22,222,3,33,333,4,44,444,5,55,555,6,66,666
            ,7,77,777,7777,8,88,888,9,99,999,9999};
        while(te>0){
            String s;
            s=cs.nextLine();
            n=s.length();
            for(i=0;i<n;i++){
                if(s.charAt(i)==' ')
                    System.out.print("0");
                else{
                    temp=s.charAt(i)-'A';
                    System.out.print(ar[temp]);
                }    
            }
            System.out.println();
            te--;
        }
	 }
}