public class TestDemo {
    public static void main(String[] args) {
        BinaryTree2 binaryTree = new BinaryTree2();
        Node root = binaryTree.buildTree();
        System.out.println("前序遍历：");
        binaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("中序遍历：");
        binaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println("后序遍历：");
        binaryTree.postOrderTraversal(root);
        System.out.println();
        binaryTree.getSize1(root);
        System.out.println("节点的个数："+BinaryTree2.size);
        binaryTree.getSize2(root);
        System.out.println("子问题求节点个数:"+BinaryTree2.size);
        binaryTree.getLeafSize1(root);
        System.out.println("叶子节点个数："+BinaryTree2.leafSize);
        binaryTree.getLeafSize2(root);
        System.out.println("子问题求叶子节点个数："+BinaryTree2.leafSize);
        System.out.println("第k层结点个数：");
        System.out.println(binaryTree.getKLevelSize(root, 3));
        System.out.println("树的高度：");
        System.out.println(binaryTree.getHeight(root));
        System.out.println("查找节点Val:");
        Node ret = binaryTree.find(root,'K');
        System.out.println(ret.val);

    }
}