package Lecture38_Mar20_TreeQues;

public class LC103 {
    /*
     * public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     * List<List<Integer>> result = new ArrayList<>();
     * if (root == null) return result;
     * 
     * Queue<TreeNode> queue = new LinkedList<>();
     * queue.offer(root);
     * boolean reverse = false;
     * 
     * while (!queue.isEmpty()) {
     * int levelSize = queue.size();
     * LinkedList<Integer> level = new LinkedList<>();
     * 
     * for (int i = 0; i < levelSize; i++) {
     * TreeNode node = queue.poll();
     * 
     * if (reverse) {
     * level.addFirst(node.val);
     * } else {
     * level.addLast(node.val);
     * }
     * 
     * if (node.left != null) queue.offer(node.left);
     * if (node.right != null) queue.offer(node.right);
     * }
     * 
     * result.add(level);
     * reverse = !reverse;
     * }
     * return result;
     * }
     * 
     */
}
