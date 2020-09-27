import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestDemo4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "bit");
        map.put(3, "hello");
        map.put(4, "lambda");
        map.forEach(new BiConsumer<Integer, String>(){
            @Override
            public void accept(Integer k, String v){
                System.out.println(k + "=" + v);
            }
        });
        map.forEach((k,v)-> System.out.println(k + "=" + v));
    }
    public static void main5(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("bit");
        list.add("hello");
        list.add("lambda");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2){
                //注意这里比较长度
                return str1.length()-str2.length();
            }
        });
        //调用带有2个参数的方法，且返回长度的差值
        list.sort((str1,str2)-> str1.length()-str2.length());
        list.forEach(s -> System.out.print(s+" "));
    }
    public static void main4(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("bit");
        list.add("hello");
        list.add("lambda");
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String str){
                //简单遍历集合中的元素。
                System.out.print(str+" ");
            }
        });
        //表示调用一个，不带有参数的方法，其执行花括号内的语句，为原来的函数体内容。
        list.forEach(s -> System.out.print(s+" "));

    }
}
