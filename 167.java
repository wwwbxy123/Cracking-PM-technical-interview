/*
To insert a number in order into a linked list, we first need to find the right place to insert the node. Then, we need to actually insert it.
The tricky bit is figuring out how to handle inserting a node into the front of the linked list.
Imagine we call an insertInOrder method that looks like this, and it (for this particular case) needs to insert n into the front of the linked list:
void insertInOrder(LinkedListNode nd, int value)
Just inserting node n and having n.next point to nd is not enough. Whoever is using the linked list doesn’t know that the real head of the linked list has been updated from nd to n. They only have a reference to nd.
Therefore, in an insert method, you need to return the new head of the linked list. Most of the time, the head will be the same as it was before you called insert. Sometimes it will change though, and you need to notify the caller of this.
*/

LinkedListNode insert(LinkedListNode head, int data){
    // create the new node
    LinkedListNode node = new LinkedListNode(data);

    // if inserted in the front, return head;
    if(head == null || data < head.data){
        node.next = head;
        return node;
    }

    //find the right place to insert
    LinkedListNode curr = head;
    while(curr.next != null && data > curr.data){
        curr = curr.next;
    }   

    //insert node
    node.next = curr.next;
    curr.next = node;

    return head;
}