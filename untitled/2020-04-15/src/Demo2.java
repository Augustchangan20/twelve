import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class Demo2 {
    //实现一个方法 toString, 把一个整型数组转换成字符串.
    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length-1) {
                ret+=",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(myToString(array));
    }
}


//给定一个整型数组, 实现冒泡排序(升序排序)
//    public static void bubbleSort(int[] array) {
//        boolean a = true;
//        for (int i = 0; i < array.length-1; i++) {
//            for (int j = 0; j < array.length-1-i; j++) {
//                if(array[j] > array[j+1]) {
//                    int tmp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = tmp;
//                     a = false;
//                }
//            }
//            if( a == true){
//                break;
//        }
//    }
//    }
//    public static void main(String[] args) {
//        int[] array1 = {1,6,9,5,4,3,8,2,7};
//        int[] array2 = {1,2,3,4,5,6,7,8,9};
//        bubbleSort (array1);
//        bubbleSort (array2);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//    }
//}


//给定一个整型数组, 判定数组是否有序（递增
//    public  static boolean isUp( int [] array){
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int [] array1 = {1,4,2,3,5,7,9};
//        int [] array2 = {1,2,3,4,5,6,7};
//        System.out.println(isUp(array1));
//        System.out.println(isUp(array2));
//    }
//}



    //给定一个有序整型数组, 实现二分查找
//    public static int binarySearch(int [] array,int key ){
//        int left = 0;
//        int right = array.length - 1;
//        while(left <= right){
//            int ret = (left + right) / 2;
//            if( array[ret] < key){
//                left = ret + 1;
//            }
//            else if(array[ret] == key){
//                return ret;
//            }
//            else{
//                right = ret - 1;
//            }
//        }
//        return  -1;
//
//    }
//
//    public static void main(String[] args) {
//        int [] array = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(binarySearch(array,6));
//
//    }
//}

//    public static int max(int [] arr){
//        int max = arr[0];
//        for (int i = 0;i <= arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//
//    }
//
//    public static void main(String[] args) {
//        int [] arr= {12,2,18,24,76,13};
//        int tmp = max(arr);
//        System.out.println(tmp);
//    }
//}

   // 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//    public static int []copyArray(int [] array){
//       int [] tmp =new int [array.length];
//       for(int i = 0;i < array.length;i++){
//
//               tmp [i] =array[i];
//           }
//       return tmp;
//    }
//    public static void main(String[] args) {
//        int [] array = {1,2,3,4,5,6,7};
//        copyArray(array);
//        System.out.println(Arrays.toString(array));
//    }
//}