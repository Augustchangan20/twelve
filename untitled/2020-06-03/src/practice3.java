import java.util.Scanner;
public class practice3 {
        public static String Solution(String s1,String s2){
            StringBuilder s = new StringBuilder(s1);
            String result = s1;
            for(int i = 0;i<s2.length();i++){
                for(int j = 0;j<result.length();j++){
                    if(s2.charAt(i)==result.charAt(j)){
                        s = s.deleteCharAt(j);
                        result = new String(s);
                    }
                }
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String result = Solution(s1,s2);
            System.out.println(result);
        }
    }




//public class practice3 {
//        public static int buyNApple(int n) {
//            if (n % 2 == 1) {
//                return -1;
//            }
//            int a = 0;
//            int b = 0;
//            for (int i=n/8; i>=0; i--) {
//                if ((n-8*i)%6 == 0) {
//                    a = i;
//                    b = (n-8*i)/6;
//                    break;
//                }
//            }
//            return a+b;
//        }
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            while (scanner.hasNext()) {
//                int n = scanner.nextInt();
//                System.out.println(buyNApple(n));
//            }
//        }
//    }

