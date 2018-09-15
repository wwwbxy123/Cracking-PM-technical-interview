/*
Given a binary search tree which contains integers as values, calculate the sum of all the numbers.
jump to question
If we approach problems from the right perspective, some problems are surprisingly simple. In this case, the “right” perspective means recursively.
*/

int sum(TreeNode root){
    if(root == null){
        return 0;
    }
    return root.data + sum(root.left) + sum(root.right);
}

method 2:

int sym(TreeNode root){
    if(root == null){
        return 0;
    }
    int total = root.data;
    if(root.left != null){
        total = total + sum(root.left);
    }

    if(root.right != null){
        total = total + sum(root.right);
    }

    return total;
}