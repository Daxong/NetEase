import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class PrintTree2 {
    public int[][] printTree(TreeNode root) {
        // write code here
        if (root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();

        StringBuilder sb = new StringBuilder();


        queue.add(root);
        TreeNode last = root;
        TreeNode nlast = last;

        while( !queue.isEmpty() )
        {
            TreeNode temp = queue.poll();
            if ( temp.left != null)
            {
                queue.add(temp.left);
                nlast = temp.left;
            }
            if ( temp.right != null ) {
                queue.add(temp.right);
                nlast = temp.right;
            }

            if(last == temp) {
                sb.append(temp.val);
                sb.append("!");
                last = nlast;


            }
            else {
                sb.append(temp.val);

            }
        }

        String str = sb.toString();//NO pure
        String[] strs= str.split("[!]");
        String pureStr = "";
        for (String  s : strs
                ) {
            pureStr += s;
        }

        int[][] ints = new int[strs.length][];
        int len = 0;
        for (int i = 0 ; i< ints.length ; i++)
        {
            int[] sub = new int[strs[i].length()];
            len += strs[i].length();
            for (int j = sub.length-1,count=0; j>-1 ; j--,count++)
            {
                sub[count] = Integer.parseInt(pureStr.charAt(len-j-1)+"");
                System.out.println(sub[count]);
            }
            ints[i] = sub;
        }

//        for (int n=0;n<ints.length;n++){
//            for (int j=0; j<ints[n].length;j++){
//                System.out.println(ints[n][j]+"===");
//            }
//        }


        return ints;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(10);

        PrintTree2 p = new PrintTree2();
        int[][] ints=p.printTree(root);

//        for (int i=0;i<ints.length;i++){
//            for (int j=0; j<ints[i].length;j++){
//                System.out.println(ints[i][j]);
//            }
//        }
    }
}