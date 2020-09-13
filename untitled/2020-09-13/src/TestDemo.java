public class TestDemo {
    public static void main(String[] args) {
        BinaryTree3 binaryTree = new BinaryTree3();
        Node root = binaryTree.buildTree("ABC##DE#G##F###");
        System.out.println("前序遍历：");
        binaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("非递归");
        binaryTree.preOrderTraversal1(root);
        System.out.println();
        System.out.println("中序遍历：");
        binaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println("非递归");
        binaryTree.inOrderTraversal1(root);
        System.out.println();
        System.out.println("后序遍历：");
        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("非递归");
        binaryTree.postOrderTraversal1(root);
        System.out.println();
        binaryTree.getSize1(root);
        System.out.println("节点的个数："+BinaryTree3.size);
        binaryTree.getSize2(root);
        System.out.println("子问题求节点个数:"+BinaryTree3.size);
        binaryTree.getLeafSize1(root);
        System.out.println("叶子节点个数："+BinaryTree3.leafSize);
        binaryTree.getLeafSize2(root);
        System.out.println("子问题求叶子节点个数："+BinaryTree3.leafSize);
        System.out.println("第k层结点个数：");
        System.out.println(binaryTree.getKLevelSize(root, 3));
        System.out.println("树的高度：");
        System.out.println(binaryTree.getHeight(root));
        System.out.println("查找节点Val:");
        Node ret = binaryTree.find(root,'A');
        System.out.println(ret.val);
        System.out.println("层序遍历：");
        binaryTree.levelOrderTraversal(root);
        System.out.println();
        System.out.println("判断完全二叉树");
        System.out.println(binaryTree.isCompleteTree(root));

    }
}