import java.util.*;
    public class demoCode {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for (int i = 1; i <= n;i++ ) {
                for (int j = 1;j <= i;j++ ) {
                    System.out.print(i + "*" + j +"="+i*j +" ");
                }
                System.out.println();
            }
        }
    }



//    public static void printNum(int num) {
//        if (num > 9) {
//            printNum(num / 10);
//        }
//        System.out.print(num % 10 + " ");
//    }
//    public static void main(String[] args) {
//        System.out.println("请输入数字:");
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        System.out.println("数字的每一位依次为：");
//        printNum(num);
//    }
//}

//    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//        if (n > 9) {
//            System.out.println(n / 10 );
//        }
//        System.out.print(n % 10 + " ");
//    }







//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int count = 3;
//        while (count != 0) {
//            System.out.println("请输入你的密码：");
//            String password = scan.nextLine();
//            if(password.equals("123456")) {
//                System.out.println("密码正确，登录成功！");
//                break;
//            }else {
//                count--;
//                System.out.println("你还有"+count+"次机会！");
//            }
//        }
//}
//}




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 31; i >= 1 ; i -= 2) {
//            System.out.print(((n >> i) & 1)+" ");
//        }
//        System.out.println();
//        for (int i = 30; i >= 0 ; i -= 2) {
//            System.out.print(((n >> i) & 1)+" ");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        int num = scanner.nextInt();
//        for(int i = 0; i < 32; i+=2) {
//            System.out.print((num >> i) & 1);
//        }
//        System.out.println();
//        for(int i = 1; i < 32; i+=2) {
//            System.out.print((num >> i) & 1);
//        }
//        System.out.println();
//    }
//}






//    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//           System.out.println("请输入一个整数");
//    int num = scanner.nextInt();
//    int count = 0;
//           for(int i = 0;i < 32;i++) {
//        if(((num >> i) & 1) == 1) {
//            count++;
//        }
//    }
//           System.out.println(count);
//}
//}

