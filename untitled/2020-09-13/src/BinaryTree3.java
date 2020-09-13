import java.lang.reflect.Array;
import java.util.*;

class Node{
    public char val;
    public Node left;//左孩子--左子树
    public Node right;//右孩子--右子树
    public Node(char val){
        this.val = val;
    }
}
class BinaryTree3{
/*    public Node buildTree(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }*/
    int i = 0;
    public Node buildTree(String str){
        Node root = null;
        if(str.charAt(i) != '#'){
            root = new Node(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);
        }else {
            i++;
        }
        return root;
    }
    // 前序遍历
    void preOrderTraversal(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历
    void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(Node root){
        if (root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }
    // 遍历思路-求结点个数 前序遍历
    static int size = 0;
    void getSize1(Node root){
        if (root == null){
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    // 子问题思路-求结点个数
    int getSize2(Node root){
        if (root == null){
            return 0;
        }
        return getSize2(root.left)+getSize2(root.right)+1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(Node root){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root){
        if (root == null)
        {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }
    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root,int k){
        if (root == null){
            return 0;
        }else if (k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k - 1) + getKLevelSize(root.right,k - 1);
    }
    // 获取二叉树的高度
    int getHeight(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);//降低时间复杂度
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找     前序遍历
    // 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, char val){
        if (root == null){
            return null;
        }
        //判断根节点是否是查找的val值
        if (root.val == val ){
            return root;
        }
        //判断左子树是否有val值
        Node left = find(root.left,val);
        if (left != null){
            return left;
        }
        Node right = find(root.right,val);
        if (right != null){
            return right;
        }
        return null;
    }
    // 层序遍历
    void levelOrderTraversal(Node root){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        //root不为空，入队
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            if (cur != null) {
                System.out.print(cur.val + " ");
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
            }
        }
    }
    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            if (cur != null){
                queue.offer(cur.left);
                queue.offer((cur.right));
            }else {
                break;
            }
        }
        //再看队列是否都为空
        while (!queue.isEmpty()){
            Node cur2 = queue.peek();
            if (cur2 != null){
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
    //二叉树的层序遍历
    //把每一层的数据放到一个list，然后将这些list放到一个大list中
/*    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0){
                Node cur = queue.poll();
                if (cur != null){
                    list.add(cur.val);//这里报错是因为之前Val定义的是char类型
                    if (cur.left != null){
                        queue.offer(cur.left);
                    }
                    if (cur.right != null){
                        queue.offer(cur.right);
                    }
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }*/
// 前序遍历   ----- 非递归实现
    void preOrderTraversal1(Node root){
        if(root == null){
            return;
        }
        Stack<Node>  stack = new Stack<>();
        Node cur = root;
        while(cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                System.out.print(cur.val+" ");
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }
    // 中序遍历
    void inOrderTraversal1(Node root){
        if(root == null){
            return;
        }
        Stack<Node>  stack = new Stack<>();
        Node cur = root;
        while(cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.print(top.val+" ");
            cur = top.right;
        }
        System.out.println();
    }
    // 后序遍历
    void postOrderTraversal1(Node root){
        if(root == null){
            return;
        }
        Stack<Node>  stack = new Stack<>();
        Node cur = root;
        Node prev = cur;
        while(cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev){
                System.out.print(cur.val+" ");
                stack.pop();
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }
        }
        System.out.println();
    }
}
