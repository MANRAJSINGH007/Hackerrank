/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node head1, Node head2) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    if(head1==null && head2==null)
    {
        return 1;
    }
    else if(head1==null && head2!=null)
    {
        return 0;
    }
    else if(head2==null && head1!=null)
    {
        return 0;
    }
    else
    {
        Node p1=head1;
        Node p2=head2;
        int c1=0;
        int c2=0;
        while(p1!=null)
        {
            p1=p1.next;
            c1++;
        }
        while(p2!=null)
        {
            p2=p2.next;
            c2++;
        }
        if(c1!=c2)
        {
            return 0;
        }
        else
        {   p1=head1;
            p2=head2;
         int flag=0;
            while(p1!=null)
            {   
                if(p1.data!=p2.data)
                {
                    flag=1;
                }
                p1=p1.next;
                p2=p2.next;
            }
         if(flag==0)
         {
             return 1;
         }
         else
         {
             return 0;
         }
        }
    }
    
  
}
