///// Bottom View of Binary Tree
class Tree
{
    public ArrayList <Integer> bottomView(Node root)
    {
       ArrayList<Integer> a=new ArrayList<>();
        Map<Integer,Integer>hm=new TreeMap<>();
       int h=height(root);
       root.hd=0;
       for(int i=1;i<=h;i++){
           hm.putAll(printlist(root,i,0));
       }
       for(int i:hm.values()){
           a.add(i);
       }
       return a;
    }
    public int height(Node temp){
        if(temp==null)
        return 0;
        int lheight=height(temp.left);
        int rheight=height(temp.right);
        if(lheight > rheight)
        return lheight+1;
        else
        return rheight+1;
        
    }
    public  Map<Integer,Integer> printlist(Node root,int level,int hd){
         Map<Integer,Integer>p=new TreeMap<>();
        
        if(root==null)
        return p;
        
         root.hd=hd;
        if(level==1){
           p.put(root.hd,root.data);
           return p;
        }
        if(level>1){
            p.putAll(printlist(root.left,level-1,hd-1));
            p.putAll(printlist(root.right,level-1,hd+1));
        }
        return p;
    }
}