import java.util.*;
public class Practice16 {
//删除公共字符
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i=0;i<ch.length;i++){
                if(!str.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
            }
        }
    }
}

    //统计同成绩学生人数
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            int n = sc.nextInt();
//            if (n == 0){
//                return;
//            }
//            int[] array = new int[n];
//            for (int i = 0;i < n;i++){
//                array[i] = sc.nextInt();
//            }
//            int tmp = sc.nextInt();
//            int count = 0;
//            for (int i = 0;i < n;i++){
//                if (tmp == array[i]){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }
//
//}
