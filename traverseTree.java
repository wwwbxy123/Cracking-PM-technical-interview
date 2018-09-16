public void preOrderTree(ArrayList array, TreeNode root){
    if(root == null) return;
    array.add(root);
    preOrderTree(array, root.left);
    preOrderTree(array, root.right);
}

public void inOrderTree(ArrayList array, TreeNode root){
    if(root == null) return;
    inOrderTree(array, root.left);
    array.add(root);
    inOrderTree(array, root.right);
}

public void postOrderTree(ArrayList array, TreeNode root){
    if(root == null) return;
    postOrderTree(array, root.left);
    postOrderTree(array, root.right);
    array.add(root);
}
