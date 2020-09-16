import java.util.Arrays;

public class TestSort {
    /**
     * 直接插入排序----稳定的排序，在比较的时候，没有跳跃性的交换
     * 稳定排序可以变不稳定，反之不能
     * 时间复杂度：
     * 最坏情况：（O(n^2)）  最好情况(有序的情况)：O(n)
     * ！！！越有序越快
     * 空间复杂度：O(1)
     * @param array
     */
    public static void insertSort(int[] array) {
        int tmp =0;
        for (int i = 1; i < array.length ; i++) {
            tmp = array[i];
            int j;
            for (j = i -1; j >=0; j--) {
                if (array[j] > tmp){
                    //此处如果变为=号，会变成并不稳定的排序
                    array[j +1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
            //比如第一次排序的时候，j的下标在J--之后是-1，不进入for循环，在赋值
        }
    }

    /**
     * 希尔排序：分组，每组进行插入排序
     * 不稳定，有跳跃式排序
     * @param array
     * @param gap
     */
    public static void shell(int[] array,int gap){
        int tmp =0;
        for (int i = gap; i < array.length ; i++) {
            tmp = array[i];
            int j;
            for (j = i -gap; j >=0; j-=gap) {
                if (array[j] > tmp){
                    //此处如果变为=号，会变成并不稳定的排序
                    array[j +gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] array){
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length ; i++) {
            shell(array,drr[i]);
        }
    }

    /**
     * 选择排序;
     * @param array
     */

    public static void selectSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[j] < array[i]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }

        }

    }

    public static void main(String[] args) {
//        int [] array = {10,5,8,4,1,9};
        int [] array = {9,6,7,21,48,6,58,2};
        System.out.println(Arrays.toString(array));
//        insertSort(array);
//        shellSort(array);
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}

