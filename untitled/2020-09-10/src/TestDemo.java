public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
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
        System.out.println("节点的个数："+BinaryTree.size);
        binaryTree.getSize2(root);
        System.out.println("子问题求节点个数:"+BinaryTree.size);
        binaryTree.getLeafSize1(root);
        System.out.println("叶子节点个数："+BinaryTree.leafSize);
        binaryTree.getLeafSize2(root);
        System.out.println("子问题求叶子节点个数："+BinaryTree.leafSize);
        System.out.println("第k层结点个数：");
        System.out.println(binaryTree.getKLevelSize(root, 3));

    }
}
