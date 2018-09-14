/*
16.5 Insert an element into a binary search tree (in order). You may assume that the binary search tree contains integers.
jump to question
This is a straightforward question that follows from the definition of a binary search tree.
In a binary search tree, lesser values are put on the left of a node and greater values are put on the right.
The easiest way to implement this is recursively. Start with the root and compare the value you want to insert, x. If x is less than the root, then call insert on the root.left. When x is greater than the root, then call insert on the right side. Repeat this until you don’t have a left or right child. Insert x there.
*/

boolean insert(TreeNode root, int data){
    if(root == null) return false;
    else{
        if(data < root.data){
            if(root.left == null) root.left = new TreeNode(data);
            else{
                return insert(root.left, data);
            }
        }
        else if(data > root.data){
            if(root.right == null) root.right = new TreeNode(data);
            else{
                return insert(root.right, data);
            }
        }
        return true;
    }
}