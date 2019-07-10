/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

	void decode(String s, Node root) {
        
        int i=0;
        Node temp=root;
        while(i<s.length())
        {
            if(s.charAt(i)=='1')
            {
                temp=temp.right;
            }
            else if(s.charAt(i)=='0')
            {
                temp=temp.left;
            }
            if(temp.left==null && temp.right==null)
            {
                System.out.print(temp.data);
                temp=root;
            }
            i++;
        }
        
        
        return ;

       
    }
