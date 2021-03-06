class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    TreeNode node1 = new TreeNode(9);
    TreeNode node2 = new TreeNode(20);
    TreeNode node3 = new TreeNode(15);
    TreeNode node4 = new TreeNode(7);

    root.left = node1;
    root.right = node2;
    node1.left = node1.right = null;
    node2.left = node3;
    node2.right = node4;
    node3.left = node3.right = null;
    node4.left = node4.right = null;

    Solution solution = new Solution();
    System.out.println(solution.maxDepth(root));
  }

}
