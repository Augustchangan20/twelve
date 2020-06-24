import java.util.*;
public class Practice23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}





//public class Practice23 {
//    //统计每个月兔子的个数
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while (input.hasNextInt()){
//            System.out.println(getTotalCount(input.nextInt()));
//        }
//    }
//    private static int getTotalCount(int monthCount){
//        if(monthCount < 3){
//            return 1;
//        }
//        return getTotalCount(monthCount - 2) + getTotalCount(monthCount - 1);
//    }
//}

