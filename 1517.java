/*
Using depth-first search, check if a tree contains a value.
Depth-first search works by checking if a value v is equal to the current node’s value. If it is not, then
you search each child of the node, one by one.
The difference between depth-first search (DFS) and breadth-first search (BFS) is that in DFS, the entire subtree of a node’s child is searched before you move on to any of the node’s other children. That is, all of node.child[0].children will be searched before you even look at node.child[1].
*/

boolean depthFirstSearch(TreeNode node, int x){
    if(node == null) return false;
    if(node.data == x) return true;
    else{
        return depthFirstSearch(node.left, x)||depthFirstSearch(node.right, x);
    }
}
