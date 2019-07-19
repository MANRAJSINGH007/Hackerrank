/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int pos) {
   // This is a "method-only" submission. 
    // You only need to complete this method.
    Node temp=new Node();
    temp.data=data;
    if(head==null)
    {
        head=temp;
    }
    else
    {
        Node ptr=head;
        int index=0;
        if(pos==0)
        {
            temp.next=head;
            head=temp;
        }
        else
        {   index=0;
            while(index<pos-1)
            {
                ptr=ptr.next;
                index++;
            }
            
            
            if(ptr.next==null)
            {
                ptr.next=temp;
                temp.next=null;
            }
         
            else
            {   
                temp.next=ptr.next;
                ptr.next=temp;
            }
            
            
            
        }
    }
    
    return head;
    
}
