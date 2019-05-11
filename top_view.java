	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    
    static int ll=Integer.MAX_VALUE;
    static int rr=Integer.MIN_VALUE;

    public static void func(Node root,int level, int h_level)
    {
        if(root==null)
        
        {
            return ;
        }
        func(root.left,level+1,h_level-1);
        if(h_level<ll)
        {
            ll=h_level;
        }
        if(h_level>rr)
        {
            rr=h_level;
        }
        func(root.right,level+1,h_level+1);
    }
    public static void calc(Node root, int level, int h_level, int[] arr, int[] brr)
    {
        if(root==null)
        {
            return ;
        }
        calc(root.left,level+1,h_level-1,arr,brr);
        if(h_level>=0)
        {
            if(level<brr[h_level])
            {
                brr[h_level]=level;
                arr[h_level]=root.data;
            }
        }
        else
        {
            int y=h_level;
            int x=-y;
            x+=rr;
            if(level<brr[x])
            {
                brr[x]=level;
                arr[x]=root.data;
            }
        }
        calc(root.right,level+1,h_level+1,arr,brr);
    }
	public static void topView(Node root) {
        
        ll=Integer.MAX_VALUE;
        rr=Integer.MIN_VALUE;
        // int h=height(root);
        func(root,0,0);
        int n=rr-ll+1;
        int arr[]=new int[n];// data of the nodes.
        int brr[]=new int[n];// for different height/ depth from the root of the binary tree
        for(int i=0;i<n;i++)
        {
            brr[i]=1000000;
        }
        calc(root,0,0,arr,brr);
        
        for(int i=arr.length-1;i>rr;i--)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<=rr;i++)
        {
            System.out.print(arr[i]+" ");
        }
        return;
    }
