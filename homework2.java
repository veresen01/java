//695. Max Area of Island
/* 
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxSize = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int tempSize = islandSize(grid, i, j);
                    if (tempSize > maxSize)
                        maxSize = tempSize;
                }
            }
        }
        return maxSize;
    }

    public int islandSize(int[][] tempGrid, int i, int j) {
        int size = 1;
        tempGrid[i][j] = 0;
        if (i + 1 < tempGrid.length) {
            if (tempGrid[i + 1][j] == 1)
                size += islandSize(tempGrid, i + 1, j);
        }
        if (i - 1 >= 0) {
            if (tempGrid[i - 1][j] == 1)
                size += islandSize(tempGrid, i - 1, j);
        }
        if (j + 1 < tempGrid[i].length) {
            if (tempGrid[i][j + 1] == 1)
                size += islandSize(tempGrid, i, j + 1);
        }
        if (j - 1 >= 0) {
            if (tempGrid[i][j - 1] == 1)
                size += islandSize(tempGrid, i, j - 1);
        }
        return size;
    }
}
*/

//733. Flood Fill
/* 
class Solution {
    private static int[][] dir = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0 || image[0].length == 0 || image[sr][sc] == newColor)
            return image;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { sr, sc });
        int height = image.length, width = image[0].length;
        int original = image[sr][sc];
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            image[cur[0]][cur[1]] = newColor;
            int tx = 0, ty = 0;
            for (int i = 0; i < 4; i++) {
                tx = cur[0] + dir[i][0];
                ty = cur[1] + dir[i][1];
                if (tx >= 0 && tx < height && ty >= 0 && ty < width && image[tx][ty] == original)
                    q.offer(new int[] { tx, ty });
            }
        }
        return image;
    }
}
*/

//101. Symmetric Tree
/* */
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return check(root.left, root.right);
    }

    private static boolean check(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null || node2 == null)
            return false;
        if (node1.val == node2.val)
            return check(node1.left, node2.right) && check(node1.right, node2.left);
        return false;
    }
}
*/