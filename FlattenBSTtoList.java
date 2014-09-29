 public void flatten(TreeNode root) {
        if (root == null)  return;
        
        if (root.left != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = null;
            root.right = left;
            TreeNode temp = left;
            while (temp.right != null) {
                temp = temp.right;
            }
            
            temp.right = right;
        }
        flatten(root.right);
    }