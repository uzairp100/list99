/**
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
class BSTsearch {
    public boolean isValidBST(TreeNode root) {
       
   
        List<Integer> list = new ArrayList<>();
        InOrderTraverse(root, list);
       
        for(int i = 1; i < list.size(); i++)
        {
            if( list.get(i-1) >= list.get(i)) return false;
        }
        return true;
    }
   
    void InOrderTraverse(TreeNode root, List<Integer> list)
    {
        //-base condition less than or equal to 1 return true
        if(root == null)  return ;
        //if( list.size() > 1 && list.get(list.size()-1) < list.get(list.size()-2)) retun false;
           
        InOrderTraverse(root.left, list);
        list.add(root.val);
        InOrderTraverse(root.right,list);
    }
}

/*
-base condition less than or equal to 1 return true
-Define ArrayList
-Traverse Tree inOrderProcess
-Check array if not sorted Asce , return false
-return true;
*/
