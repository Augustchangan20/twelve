import java.util.*;
public class PracticeDemo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                String str = scanner.nextLine();
                int max = 0;
                int count=0;
                int end=0;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                        count++;
                        if(max<count){
                            max= count;
                            end = i;
                        }
                    }else{
                        count = 0;
                    }
                }
                System.out.println(str.substring(end-max+1,end+1));
            }
        }
    }

//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            while(sc.hasNext()){
//                int n = sc.nextInt();
//                System.out.println(Number(n));
//            }
//        }
//        public static int Number(int n){
//            int bottle= 0;
//            while(n>2){
//                bottle = bottle + n/3;
//                n = n/3 + n%3;
//            }
//            if(n == 2){
//                bottle++;
//            }
//            return bottle;
//        }
//    }



