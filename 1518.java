/*
Write the pseudocode for breadth-first search on a binary tree. Try to be as detailed as possible.
jump to question
 
To perform breadth-first search, we want to search a node level by level. That is, we want to search each of node’s children before we search any of their children.
Although breadth-first search is conceptually straightforward (just search a node’s children, level by level), implementing it can be a little less intuitive. The main trick to remember is that we need to use a queue.
A queue, as you might recall, is a data structure that allows us to add items on one side and remove them from the other side. It is a “first in, first out” (FIFO) data structure. This enables us to basically flag nodes “as to be processed later.”
In BFS, we “visit” a node by comparing the value we’re searching for (x) to the current value. If it matches, we’re done and can immediately return true. Else, then we add node’s children to the end of the queue. We then move on, pulling a node from the other side and searching it.
*/

boolean searchBFS(TreeNode root, int x){
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    return searchBFS(root, x, queue);
}

boolean searchBFS(TreeNode root, int x, Queue<TreeNode> queue){
    queue.add(root);
    while(!queue.isEmpty()){
        TreeNode node = queue.remove();
        if(node.data == x) return true;
        if(node.left != null) queue.add(node.left);
        if(node.right != null) queue.add(node.right);
    }

return false;

}