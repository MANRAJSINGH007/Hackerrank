    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
       
        DoublyLinkedListNode current=head.next;
        DoublyLinkedListNode prev=null;
        DoublyLinkedListNode next=null;
        if(head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            return head;
        }
        
        next=head.next;
        head.next=prev;
        prev=head;
        
        while(current!=null)
        {   
            next=current.next;// next node
            current.next=prev;
            prev.prev=current;
            prev=current;
            current=next;
            
        }
        
        head=prev;

        return head;
        
    }
