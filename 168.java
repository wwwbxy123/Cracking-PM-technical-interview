/*
“Sort” a linked list that contains just 0s and 1s. That is, modify the list such that all 0s come before all 1s.
jump to question
 There are many ways of doing this problem.
*/


// method1:  build a “zeros list” and a “ones list” and then join them at the end.
LinkedListNode sort(LinkedListNode head){
    LinkedListNode ZeroHead = null;
    LinkedListNode ZeroTail = null;
    LinkedListNode OneHead = null;
    LinkedListNode OneTail = null;
    LinkedListNode n = head;

    while(n != null){
        LinkedListNode next = n.next;
        n.next = null;

        if(n.data == 0){
            //add 0 to the zeros list
            if(ZeroHead == null){
                ZeroHead = n;
            }
            else{
                ZeroTail.next = n;
            }
            ZeroTail = n;
        }

        else{
            // add 1 to the Ones list
            if(OneHead == null){
                OneHead = n;
            }
            else{
                OneTail.next = n;
            }
            OneTail = n;
        }
        n = n.next;
    }
    //join lists and return
    if(ZeroTail == null){
        OneTail.next = null;
        return OneTail;
    }
    else{
        ZeroTail.next = OneHead;
        return ZeroHead;
    }
}

//method2: keep track of the head and tail of the (new) linked list. When we get a new 0, we insert it at the very front. When we get a new 1, we insert it at the very end. This will keep all 0s before every 1.
LinkedListNode sort(LinkedListNode n){
    LinkedListNode head = n;
    LinkedListNode tail = n;

    //start with the 2nd element
    n = n.next;
    while(n != null){
        LinkedListNode next = n.next;
        if(n.data == 0){
            // add 0 to front
            n.next = head;
            head = n;
        }
        else{
            // add 1 to the tail
            tail.next = n;
            tail = n;
        }
        n = n.next;
    }
    // end the tail
    tail.next = null;
}

//method3: we can just iterate through the linked list once, counting the number of 0s. Then, we iterate through it again, setting the first k values to 0 and the rest to 1.
void sort(LinkedListNode head){
    int k = 0;

    //count 0;
    LinkedListNode head = n;
    while(n != null){
        if(n.data == 0){
            k++;
        }
        n = n.next;        
    }

    //set the first k value to 0

    n = head;
    while(n != null){
         while (k > 0){
             n.data = 0;
             k--;
             n = n.next;
         }
         n.data = 1;
         n = n.next;
    }
}
