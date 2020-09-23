/**泛型的边界
 *写一个泛型类，包含一个方法，该方法是找到数组中的最大值
 *  写一个方法，该方法传入参数T[]，找到最大值并返回
 *  T extends Comparable<T> 泛型的边界---上界
 *  代表T一定是实现了Comparable接口的
 *  泛型没有下界
 */

class Generic<T extends Comparable<T>> {
    public T maxNum(T[] array){
        T max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }



}
class Generic2{
    //Generic2 不是泛型类，只是里面包含一个泛型类 的静态方法
    //泛型语法
    public static <T extends Comparable<T>> T maxNum(T[] array){
        T max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
}

/**
 * 类型推导---根据实参的类型推导出形参的类型
 */
public class TestDemo3 {
    public static void main(String[] args) {
        Integer[] array = {12,4,2,87,5,19};
        System.out.println(Generic2.maxNum(array));
        String[] strings = {"abc","hello","bit"};
        System.out.println(Generic2.maxNum(strings));
    }
    public static void main1(String[] args) {
        Generic<Integer> generic = new Generic<>();
        Integer[] array = {12,4,2,87,5,19};
        System.out.println(generic.maxNum(array));

        Generic<String> generic1 = new Generic<>();
        String[] strings = {"abc","hello","abcdef"};
        System.out.println(generic1.maxNum(strings));

    }
}
