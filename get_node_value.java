/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    
    Node p=head;
    int count=0;
    while(p!=null)
    {
        p=p.next;
        count++;
    }
    
    count=count-n-1;
    int index=0;
    p=head;
    while(index!=count)
    {
        index++;
        p=p.next;
    }

    return (p.data);
}
