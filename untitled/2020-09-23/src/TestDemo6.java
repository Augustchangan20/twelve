import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 牛客：旧键盘问题
 * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
 * 肯定坏掉的那些键
 */
public class TestDemo6 {
    public static void main(String[] args) {
        BSTree bsTree = new BSTree();
        int[] array = {7,2,9,18,56,15,3};
        for (int i:array) {
            bsTree.insert(i);
        }
        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();
        System.out.println(bsTree.search(18).val);
        System.out.println(bsTree.search(0));
        bsTree.remove(9);
        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();
        String acture = scanner.nextLine();
        //1>把实际的字符转化为大写存放于集合中
        Set<Character> setActure = new HashSet<>();
        for (char s: acture.toUpperCase().toCharArray()) {
            setActure.add(s);
        }
        Set<Character> setBroken = new HashSet<>();
        for (char t: expected.toUpperCase().toCharArray()) {
            if (!setActure.contains(t) && !setBroken.contains(t)){
                System.out.print(t+" ");
                setBroken.add(t);
            }
        }
    }
}
