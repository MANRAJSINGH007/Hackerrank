

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
        while(true)
        {
            if(v1>root.data && v2>root.data)
            {
                root=root.right;
            }
            else if(v1<root.data && v2<root.data)
            {
                root=root.left;
            }
            else
            {
                return root;
            }
        }
    	
    }
