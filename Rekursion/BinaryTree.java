package Rekursion;

public class BinaryTree {
    public static void main(String[] args) {
        
        TreeKnot root = new TreeKnot(1);
        root.left = new TreeKnot(2);
        root.right = new TreeKnot(3);
        root.left.left = new TreeKnot(4);
        root.left.right = new TreeKnot(5);
        root.right.left = new TreeKnot(6);
        root.right.right = new TreeKnot(7);
        root.left.left.left = new TreeKnot(8);
        root.left.left.right = new TreeKnot(9);

        int height = getTreeHeight(root);
        System.out.println("Height of the binary tree is: " + height);
    }

    private static int getTreeHeight(TreeKnot tk) {
        if (tk == null) {
            return 0;
        }
        int leftHeight = getTreeHeight(tk.left);
        int rightHeight = getTreeHeight(tk.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
