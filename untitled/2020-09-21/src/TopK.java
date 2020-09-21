import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

 class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        //优先级队列底层默认小根堆，如果要变成大根堆，这里变为o2 - o1
        return o2 - o1;
    }
}

/**
 * 求前K个最大的-----建立大小为k的小根堆
 * 求前K个最大的-----建立大小为K的大根堆
 */
public class TopK {
    public static Integer[] topK(int[] array, int k) {
        MyComparator myComparator = new MyComparator();
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(myComparator);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            //重写了compare方法
            public int compare(Integer o1, Integer o2) {
                return  o2 - o1;
            }
        });
        for (int i = 0; i < array.length; i++) {
            if (maxHeap.size() < k) {
                maxHeap.offer(array[i]);
            } else {
                Integer val = maxHeap.peek();
                if (val != null && val > array[i]) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for (int i = 0;i < k;i++){
            int v = maxHeap.poll();
            ret[i] = v;
        }
        return ret ;
    }

    public static void main(String[] args) {
        int[] array = {13,1,7,8,18,20,15};
        Integer[] ret = topK(array,4);
        System.out.println(Arrays.toString(ret));
    }
}
