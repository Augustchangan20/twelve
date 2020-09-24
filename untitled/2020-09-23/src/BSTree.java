/**
 * 二叉搜索树又称二叉排序树，它或者是一棵空树**，或者是具有以下性质的二叉树:
 * 若它的左子树不为空，则左子树上所有节点的值都小于根节点的值
 * 若它的右子树不为空，则右子树上所有节点的值都大于根节点的值
 * 它的左右子树也分别为二叉搜索树
 */
public class BSTree {
    public static class Node{
        //静态内部类
        public int val;
        public Node left;
        public Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public Node root = null;
    public boolean insert(int val){
        //假设这棵树没有两个相同的value值，且插入只能插入叶子节点下
        Node node = new Node(val);
        if (root == null){
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while (cur != null){
            if (cur.val == val){
                return false;
            }else if(cur.val < val){
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        //cur为空 位置找到 进行插入
        if (parent.val > val){
            parent.left = node;
        }else {
            parent.right = node;
        }
        return true;
    }
    public Node search(int val){
        Node cur = root;
        while (cur != null){
            if (cur.val == val){
                return cur;
            }else if (cur.val < val){
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }
    public void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public boolean remove(int key){
        Node cur = root;
        Node parent = null;
        while (cur != null){
            if (cur.val == key){
                removeNode(parent,cur);
                return true;

            }else if (key < cur.val){
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        return  false;
    }
    public void removeNode(Node parent,Node cur){
        if (cur.left == null){
            if (cur == root){
                root = cur.right;
            }
            else if (cur == parent.left){
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }
        else if (cur.right == null){
            if (cur == root){
                root = cur.left;
            }
            else if (cur == parent.left){
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }
        else {
            Node targetParent = cur;
            Node target = cur.right;
            while (target.left != null){
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;
            if (target == targetParent.left){
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }
}
