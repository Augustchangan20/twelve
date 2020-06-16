import java.util.*;
public class Practice14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] chars = N.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0);
        }
        for (int i = 0; i < chars.length; i++) {
            list.set(chars[i]-'0',list.get(chars[i]-'0')+1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }
    }
}

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int[] counts = new int[20];
//            for (int i=0; i<10; ++i) {
//                counts[i] = scanner.nextInt();
//            }
//            for (int i=1; i<10; ++i) {
//                if (counts[i]>0) {
//                    System.out.print(i);
//                    counts[i]--;
//                    break;
//                }
//            }
//            for (int i=0; i<10; ++i) {
//                while(counts[i]>0) {
//                    System.out.print(i);
//                    counts[i]--;
//                }
//            }
//        }
//    }




//    public static void main(String[] args) {
//        System.out.println("value = "+switchit(4));
//    }
//    public static int switchit(int x){
//        int j = 1;
//        switch (x){
//            case 1:j++;
//            case 2:j++;
//            case 3:j++;
//            case 4:j++;
//            case 5:j++;
//            default:j++;
//        }
//        return j + x;
//    }
//
//}
