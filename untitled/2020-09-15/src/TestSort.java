import jdk.internal.org.objectweb.asm.tree.FrameNode;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

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
     * 选择排序:
     * 时间复杂度：O（n^2）
     * 空间复杂度：O(1)
     * 不稳定排序
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
    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2 * parent + 1;
        while (child < len) {
            //有左孩子
            if (child + 1 < len && array[child] < array[child + 1]) {
                child++;
            }
            if (array[parent] < array[child]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }
    public static void createHeap(int[] array){
        for (int i = (array.length-1-1)/2; i >=0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    /**
     * 堆排序
     * 时间复杂度：O(nlogn)-----无论有序无序都是
     * 空间复杂度：O（1）
     * 不稳定排序
     * @param array
     */
    public static void heapSort(int[] array){
        createHeap(array);
        int end = array.length -1;
        while (end >0){
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    /**
     * 冒泡排序：
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定的排序
     * @param array
     */
    public static void bubbleSort(int[] array){
        //i表示趟数
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j < array.length-1-i ; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void bubbleSort1(int[] array){
        //代码优化，如果初始数组就是有序的，直接返回
        boolean flg = false;
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j < array.length-1-i ; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flg = true;
                }
            }
            if (flg == false){
                return;
            }
        }
    }
    public static int partition(int[] array,int low,int high){
        int tmp = array[low];
        while (low < high){
            while (low < high && array[high] >= tmp){
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= tmp){
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }
    public static void insert_Sort(int[] array,int start,int end) {
        int tmp =0;
        for (int i = start+1; i <= end ; i++) {
            tmp = array[i];
            int j;
            for (j = i -1; j >=start; j--) {
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
    public static void swap(int[]array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void threr_num_mid(int[] array,int left,int right) {
        //实现array[mid] <= array[left] <= array[right]
        int mid = (left + right)/2;
        if (array[left] > array[right]){
            swap(array, left, right);
        }
        if (array[mid] > array[left]){
            swap(array,mid,left);
        }if (array[mid] > array[right]){
            swap(array,mid,right);
        }
    }
    public static void quick(int[] array,int left,int right){
        if (left >= right){
            return;
        }
        //优化方式一：当待排序数据的个数小于等于100的时候，用直接插入排序
        /*if (right - left +1 <= 100){
            insert_Sort(array,left,right);
            return;
        }*/
        //优化方式二：三数取中法
        threr_num_mid(array, left, right);
        int par = partition(array,left,right);
        quick(array,left,par -1);
        quick(array,par +1,right);
    }

    /**
     * 递归
     * 快速排序----分治思想
     * 时间复杂度：o(nlogn)      最坏情况：O(n^2)
     * 空间复杂度:o(logn)                o(n)
     * 不稳定
     * @param array
     */
    public static void quickSort1(int[] array){
        quick(array,0,array.length -1);
    }

    /**
     * 非递归快速排序
     * @param array
     */
    public static void quickSort(int[] array){
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = array.length -1;
        int par = partition(array, left, right);
        if (par > left +1){
            stack.push(left);
            stack.push(par-1);
        }
        if (par < right -1){
            stack.push(par+1);
            stack.push(right);
        }
        while (!stack.empty()){
            right = stack.pop();
            left = stack.pop();
            par = partition(array, left, right);
            if (par > left +1){
                stack.push(left);
                stack.push(par-1);
            }
            if (par < right -1){
                stack.push(par+1);
                stack.push(right);
            }
        }
    }
    //归并----将两个有序段归并为一个有序段
    public static void merge(int[] array,int low,int mid,int high){
        int s1 = low;
        int s2 = mid +1;
        int len = high - low +1;
        int[] ret = new int[len];
        int i = 0;//用来表示ret数组的下标
        while (s1 <= mid && s2 <= high){
            if (array[s1] < array[s2]){
                ret[i++] = array[s1++];
            }else {
                ret[i++] = array[s2++];
            }
        }
        while (s1 <= mid){
            ret[i++] = array[s1++];
        }
        while (s2 <= high){
            ret[i++] = array[s2++];
        }
        for (int j = 0; j <ret.length ; j++) {
            array[j+low] = ret[j];//拷贝
        }
    }
    public static void mergeSortInternal(int[] array,int low,int high){
        if (low >= high){
            return;
        }
        //分解
        int mid = (low + high)>>>1;
        //>>>右移一位，相当于除法
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }
    public static void mergeSort1(int[] array){
        mergeSortInternal(array,0,array.length-1);

    }

    //非递归
    public static void mergeNor(int[] array,int gap){
        int[] ret = new int[array.length];
        int k = 0;//记录ret的下标
        int s1 = 0;
        int e1 = s1 + gap -1;
        int s2 = e1 + 1;
        int e2 = s2 + gap -1 < array.length ? s2 + gap -1:array.length -1;
        //1>能进循环，则至少有两个归并段；如果没有，直接将第一段下移
        while (s2 < array.length){
            //2>、对应的s1位置和s2位置进行比较
            while (s1 <= e1 && s2 <= e2){
                if (array[s1] <= array[s2]){
                    ret[k++] = array[s1++];
                }else {
                    ret[k++] = array[s2++];
                }
            }
            //3>、第二步当中，肯定会有一个下标将归并段先走完
            //4>、判断是谁没走完，把剩下的数据拷贝到结果数组中
            while (s1 <= e1){
                ret[k++] = array[s1++];
            }
            while (s2 <= e2){
                ret[k++] = array[s2++];
            }
            //5>、接着确定新的s1,e1,s2,e2
            s1 = e2 +1;
            e1 = s1 + gap -1;
            s2 = e1 + 1;
            e2 = s2 + gap -1 < array.length ? s2 + gap -1:array.length -1;
        }
        //6>、还需判断是否有另外的归并段
        while (s1 <= array.length -1){
            ret[k++] = array[s1++];
        }
        for (int i = 0; i < ret.length; i++) {
            array[i] = ret[i];
        }
    }
    /**
     * 非递归实现归并排序
     * @param array
     */
    public static void mergeSort(int[] array){
        //让gap每次2倍增长
        for (int gap = 1; gap < array.length ; gap*=2) {
            mergeNor(array,gap);
        }
    }

    public static void main1(String[] args) {
        int[] array = new int [10_0000];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = i;
//            array[i] = random.nextInt(10_0000);
        }
        long start = System.currentTimeMillis();
        quickSort(array);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void main(String[] args) {
//        int [] array = {10,5,8,4,1,9};
        int [] array = {9,6,7,21,48,10,58};
        System.out.println(Arrays.toString(array));
//        insertSort(array);
//        shellSort(array);
//        bubbleSort1(array);
//        quickSort(array);
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}

