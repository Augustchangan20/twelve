import java.util.*;

public class Test {
    public static void main(String[] args) {
        //反转单词？
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            for (int i = str.length() - 1; i >= 0 ; i--) {
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main1(String[] args) {
        //找出字符串中出现一次的字符
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                int val = map.get(str.charAt(i));
                map.put(str.charAt(i),val + 1);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        for (int i = 0; i < str.length() ; i++) {
            if (map.get(str.charAt(i)) == 1){
                System.out.print(str.charAt(i));
            }
        }
    }
}
